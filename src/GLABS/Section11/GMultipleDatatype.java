package GLABS.Section11;

public class GMultipleDatatype <DataTypeone, DataTypeTwo>{
    DataTypeone valueOne;
    DataTypeTwo valueTwo;

    public GMultipleDatatype(DataTypeone v1, DataTypeTwo v2){
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    public DataTypeone getValueOne(){
        return valueOne;
    }
    public void setValueOne(DataTypeone valueOne){
        this.valueOne = valueOne;
    }

    public DataTypeTwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(DataTypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }

}
