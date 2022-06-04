package BubbleSort;

public class BubbleSort {
    private int[] data;

    //Constructor
    public BubbleSort(){

    }

    public int[] getData() { return data; }
//    public String[] getData() {return data;}

    public void setData(int[] data) {
        this.data = data;
    }

//    public void setData(String[] data) { this.data = data; }

    public void sortData(){
        int lenData = this.data.length;
        for (int i=0; i<lenData; i++) {
            for (int j=1+1; j<lenData; j++) {
                if (this.data[j] <this.data[i]) {
                    int temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = temp;
                }
            }
        }


    }

//    public String[] getData() {return data;}

//    public void setData(String[] data) { this.data = dataString; }

    public void PrintData (){
        for (int datum : this.data) {
            System.out.println(datum+ " ");
        }
    }

    public static void main(String[] args) {
        int[] s = new int[] {10, 35, 32, 13, 26}; //mengurutkan Tipe Data INT
        //String[] nama = {"Adi","Faqih","Jodi","Maudy","yesa"}; //Tugas mengurutkan Tipe data String

        BubbleSort _myBubble = new BubbleSort();
        _myBubble.setData(s);
        _myBubble.sortData();
        _myBubble.PrintData();

    }

}
