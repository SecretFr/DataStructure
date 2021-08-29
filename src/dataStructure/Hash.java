package dataStructure;
//key에 value(data)를 매핑할 수 있는 구조
//key를 통해 데이터가 저장되어 있는 주소를 알 수 있으므로, 저장 및 탐색 속도가 획기적으로 빨라짐
//key -> hash function(key) -> hash table

public class Hash {
    public Slot[] hashTable;

    public Hash(Integer size){
        this.hashTable = new Slot[size];    
    }

    public class Slot{
        String value;
        Slot(String value){
            this.value = value;
        }
    }

    //Division 기법: 가장 간단한 해쉬 함수 중 하나로, 나누기를 통해, 나머지 값을 사용하는 기법
    public int hashFunc(String key){
        return Character.getNumericValue(key.charAt(0))%this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            this.hashTable[address].value = value;
        }
        else{
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            return this.hashTable[address].value;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args){
        Hash mainObject = new Hash(20);
        mainObject.saveData("DaveLee", "101038293");
        mainObject.saveData("fun-coding", "222101038293");
        mainObject.saveData("aun-deep", "123");
        System.out.println(mainObject.getData("fun-coding")); 
    }
}


