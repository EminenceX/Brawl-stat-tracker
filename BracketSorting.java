package tournament;

/**
 *
 * @author Kyle
 */
public class BracketSorting {

    String field1;
    String field2;
    String field3;
    String field4;
    String field5;
    String field6;
    String field7;
    String field8;
    String[] pArray;
    int numPlayers;

    public void setFields(String[] playerArray) {
        numPlayers = playerArray.length;
        field1 = playerArray[0];
        field2 = playerArray[7];
        field3 = playerArray[1];
        field4 = playerArray[6];
        field5 = playerArray[2];
        field6 = playerArray[5];
        field7 = playerArray[3];
        field8 = playerArray[4];
        
    }
    
    public int getSize(){
        return numPlayers;
    }

    public String getField1() {
        System.out.println(field1);
        return field1;
    }
    
    public String getField2() {
        return field2;
    }
    
    public String getField3() {
        return field3;
    }
    
    public String getField4() {
        return field4;
    }
    
    public String getField5() {
        return field5;
    }
    
    public String getField6() {
        return field6;
    }
    
    public String getField7() {
        return field7;
    }
    
    public String getField8() {
        return field8;
    }
}
