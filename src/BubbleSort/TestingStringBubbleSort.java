package BubbleSort;

public class TestingStringBubbleSort {
    private String[] data;

    //Construtor

    public TestingStringBubbleSort(){

    }

    public String[] getData() {return data ;}

    public void setData(String[] data) {this.data = data;}

    public void sortData() {
        String nama = this.data.length;
        char[] array = nama.toCharArray();
        for (String i=0; i<array; i++){
            for (String j=i+1; j<array; j++){
                if (this.data[j]<this.data[i]){
                    String temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = temp;
                }
            }
        }
    }

    public void PrintData(){
        for (String Array : this.data) {
            System.out.println(Array + " ");
        }
    }

    public static void main(String[] args) {
        String[] array = {"Adi","Faqih","Jodi","Maudy","yesa"};
        BubbleSort _myBubble = new BubbleSort();
        _myBubble.setData(array);
        _myBubble.sortData();
        _myBubble.PrintData();
    }



}
