package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        for(char char2: sequence2) {
            System.out.print("\t"+char2);
        }
        System.out.println();
        for (int i =0;i<sequence1.length;i++) {
            for(int j=0;j<sequence2.length;j++) {
            
            }
        }
        for (char char1 :sequence1) { {
            System.out.print(char1);
            for(char char2: sequence2) {
                if(char1 == char2) {
                System.out.print("\t+");
                } else {
                System.out.print("\t ");
                }
            }
            System.out.println();
        }}
    }
}
