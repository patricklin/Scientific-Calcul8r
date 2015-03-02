package com.example.patrick.calculator;

import static org.matheclipse.core.expression.F.*;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.EvalUtilities;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.parser.client.math.MathException;

/**
 * @author Bryan Nguyen
 */
public class SymjaParser {
    public static String toSymja(String input) {
        /* No conversion needed:
         *   numerals
         *   + - * /
         *   ( )
         * Conversion
         *   i --> I
         *   e --> E
         *   E --> (decimal)E
         *   sin cos tan --> Sin Cos Tan
         *   user assigned variables --> $
         */
        EvalUtilities util = new EvalUtilities(false, true);
        IExpr result = util.evaluate(input);
        return result.toString();
    }
}
