public class TestingStringBubblesort2 {
    public static void main(String[] args) {
        String nama[] = {"Idham", "Rizal", "Adi", "Febrian", "Sholih"};
        for (int j=0; j<nama.length; j++) {
            for (int i = j+1; i<nama.length; i++) {
                if (nama[i].compareTo(nama[j]) <0) {
                    String temp;
                    temp = nama[j];
                    nama [j] = nama[i];
                    nama[i] = temp;
                }
            }
            System.out.println(nama[j]);
        }
    }
    
    
}
