package hex.genmodel.descriptor;

import java.io.Serializable;
import java.util.Arrays;

public class VariableImportances implements Serializable {

    private final String[] _variables;
    private final double[] _importances;

    public VariableImportances(String[] variableNames, double[] relativeImportances) {
        this._variables = variableNames;
        this._importances = relativeImportances;
    }

    public String[] getVariableNames() {
        return Arrays.copyOf(_variables, _importances.length);
    }

    public double[] getImportances() {
        return Arrays.copyOf(_importances, _importances.length);
    }
}