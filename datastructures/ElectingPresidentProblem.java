package datastructures;

import java.util.ArrayList;
import java.util.List;

public class ElectingPresidentProblem {
    public static void main(String[] args) {
              int n=4;
              int k =2;
        System.out.println(electPresident(n,k));
    }

    private static int electPresident(int n, int k) {
        List<Integer> studentsList = new ArrayList<Integer>();

        for(int i=1; i<=n; i++){
           studentsList.add(i);
        }

        int index =0;
        while(studentsList.size() > 1){
           index = (index +k-1 ) % studentsList.size();
        int r=   studentsList.remove(index);
            System.out.println(r);

        }
        return studentsList.get(0);
    }

}
//"A group of students are sitting in a circle. The teacher is electing a new class president. The teacher does this by singing a song while walking around the circle. After the song is finished the student at which the teacher stopped is removed from the circle. Starting at the student next to the one that was just removed, the teacher resumes singing and walking around the circle. After the teacher is done singing, the next student is removed. The teacher repeats this until one student is left.
//A song of length k will result in the teacher walking past k students on each round. The students are numbered 1 to n. The teacher starts at student 1.
//        For example, suppose the song length is two(k=2). And there are four students to start with (1,2,3,4). The first student to go would be '2', after that '4', and after that '3’. Student '1' would be the next president in this example.
//
//n - the number of students sitting in a circle
//k - the length (in students) of each song.
//
//        return the number of the student that is elected."