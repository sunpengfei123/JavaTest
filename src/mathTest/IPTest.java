package mathTest;

import com.microsoft.z3.*;

import java.util.HashMap;

public class IPTest {
    public static void main(String[] args) {
        try {
            HashMap<String, String> cfg = new HashMap<String, String>();
            cfg.put("model", "true");
            Context ctx = new Context(cfg);
            Solver s = ctx.mkSolver();
            RealExpr a = ctx.mkRealConst("a");
            RealExpr c = ctx.mkRealConst("c");
            RealExpr d = ctx.mkRealConst("d");
            RealExpr e = ctx.mkRealConst("e");
            RealExpr x = ctx.mkRealConst("x");
            RealExpr y = ctx.mkRealConst("y");
            ArithExpr left = ctx.mkAdd(x, ctx.mkMul(y, c, e));
            ArithExpr right = ctx.mkAdd(d, a);
            BoolExpr equation = ctx.mkEq(left, right);
            s.add(equation);
            s.add(ctx.mkGt(a, ctx.mkReal(1)));
            Status result = s.check();
            if (result == Status.SATISFIABLE) {
                System.out.println("model for: x + y*c*e = d + a, a > 1");
                System.out.print(s.getModel());
                System.out.println(a.toString());
                Expr a_value = s.getModel().evaluate(a, false);
                System.out.println(a_value.toString());
            } else if (result == Status.UNSATISFIABLE)
                System.out.println("unsat");
            else
                System.out.println("unknow");

        } catch (Exception e) {
            System.out.println("z3 exception");
            e.printStackTrace();
        }
    }
}
