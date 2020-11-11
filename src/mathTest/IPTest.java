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
            RealExpr v1 = ctx.mkRealConst("v1");
            RealExpr v2 = ctx.mkRealConst("v2");
            RealExpr v3 = ctx.mkRealConst("v3");
            RealExpr e1 = ctx.mkRealConst("e1");
            RealExpr e2 = ctx.mkRealConst("e2");
            RealExpr e3 = ctx.mkRealConst("e3");
            RealExpr x1 = ctx.mkRealConst("x1");
            RealExpr x2 = ctx.mkRealConst("x2");
            RealExpr x3 = ctx.mkRealConst("x3");
            ctx.mkOr();
            ArithExpr right121 = ctx.mkMul(ctx.mkAdd(x1,ctx.mkInt(-1)),ctx.mkAdd(x2,ctx.mkInt(-1)),ctx.mkAdd(v2,ctx.mkInt(5)));
            ArithExpr right122 = ctx.mkMul(x1,x2,ctx.mkAdd(v2,ctx.mkInt(3)));
            ArithExpr right211 = ctx.mkMul(ctx.mkAdd(x2,ctx.mkInt(-1)),ctx.mkAdd(x1,ctx.mkInt(-1)),ctx.mkAdd(v1,ctx.mkInt(3)));
            ArithExpr right212 = ctx.mkMul(x2,x1,ctx.mkAdd(v1,ctx.mkInt(2)));

            s.add(ctx.mkOr(ctx.mkGe(v1,right121),ctx.mkGe(v2,right211)));
            s.add(ctx.mkOr(ctx.mkGe(v1, right122),ctx.mkGe(v2,right212)));

            ArithExpr right131 = ctx.mkMul(ctx.mkAdd(x1,ctx.mkInt(-1)),ctx.mkAdd(x3,ctx.mkInt(-1)),ctx.mkAdd(v3,ctx.mkInt(6)));
            ArithExpr right132 = ctx.mkMul(x1,x3,ctx.mkAdd(v3,ctx.mkInt(3)));
            ArithExpr right311 = ctx.mkMul(ctx.mkAdd(x1,ctx.mkInt(-1)),ctx.mkAdd(x3,ctx.mkInt(-1)),ctx.mkAdd(v1,ctx.mkInt(3)));
            ArithExpr right312 = ctx.mkMul(x1,x3,ctx.mkAdd(v1,ctx.mkInt(2)));

            s.add(ctx.mkOr(ctx.mkGe(v1, right131),ctx.mkGe(v3, right311)));
            s.add(ctx.mkOr(ctx.mkGe(v1, right132),ctx.mkGe(v3, right312)));

            ArithExpr right231 = ctx.mkMul(ctx.mkAdd(x2,ctx.mkInt(-1)),ctx.mkAdd(x3,ctx.mkInt(-1)),ctx.mkAdd(v3,ctx.mkInt(6)));
            ArithExpr right232 = ctx.mkMul(x2,x3,ctx.mkAdd(v2,ctx.mkInt(3)));
            ArithExpr right321 = ctx.mkMul(ctx.mkAdd(x3,ctx.mkInt(-1)),ctx.mkAdd(x2,ctx.mkInt(-1)),ctx.mkAdd(v2,ctx.mkInt(5)));
            ArithExpr right322 = ctx.mkMul(x3,x2,ctx.mkAdd(v2,ctx.mkInt(3)));

            s.add(ctx.mkOr(ctx.mkGe(v2, right231),ctx.mkGe(v3, right321)));
            s.add(ctx.mkOr(ctx.mkGe(v2, right232),ctx.mkGe(v3, right322)));

            BoolExpr absx1x0 = ctx.mkEq(x1,x2);


            Status result = s.check();
            if (result == Status.SATISFIABLE) {
                System.out.println("model for: x + y*c*e = d + a, a > 1");
                System.out.print(s.getModel());
                System.out.println(x1);

                Expr x1_value = s.getModel().evaluate(x1, true);

                System.out.println(x1_value.toString());

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
