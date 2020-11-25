package ThinkLikeAProgrammer;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<Integer> code = new ArrayList<>();
        code.add(2);
        code.add(7);
        code.add(9);

        int code1 =2;
        int code2 = 7;
        int code3 = 9;

        for(int x=0; x<=10; x++) {
            for(int y=0; y<=10; y++){
                for(int z=0; z<=10; z++){
                    if(x==code1 && y==code2 && z==code3)
                    System.out.println(x +" : "+y+" : "+ z);
                }
            }

        }
    }
}
