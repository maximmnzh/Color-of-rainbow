public class Loader {
    public static void main(String[] args) {
        String colors[] = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Purple"};
        System.out.println("The colors of rainbow: ");
        for(int i=0; i<colors.length; i++){
            System.out.println(colors[i]);
        }
        System.out.println("\nThe colors of rainbow in reverse order: ");
        for(int i=colors.length-1; i>=0; i--){
            System.out.println(colors[i]);
        }
    }
}
