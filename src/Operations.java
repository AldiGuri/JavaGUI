import java.util.List;
import java.util.Scanner;

public class Operations {
    File_IO fio =new File_IO();
    //Paraqet te gjitha rreshtat
    public String DisplayData(String filepath){

        String Lines= fio.ReadFromFile(filepath);
        return Lines;

    }
    //Shton nje president ne liste
    public void AddPresident(String filePath){
        String PresidentStr;
        Scanner input=new Scanner(System.in);
        System.out.print("Emri:");
        String name= input.nextLine();
        System.out.print("Mbiemri:");
        String surname= input.nextLine();
        System.out.print("Viti in inagurimit:");
        String dateofBirth=input.nextLine();
        System.out.print("Mosha:");
        String state=input.nextLine();
        System.out.print("Shteti:");
        int mandate=input.nextInt();
        PresidentStr="\n"+name+"\t"+surname+"\t"+dateofBirth+"\t"+state+"\t"+mandate;
        fio.AppendToFile(PresidentStr,filePath);
    }

    //Kerkon presidentin ne liste me emer
    public void SearchPresident(List<String> Lines, String president){
        boolean Found=false;
        for(int i=0;i<Lines.size();i++){
            if(Lines.get(i).contains(president)){
                System.out.println("President Found:");
                System.out.println(Lines.get(i));
                Found=true;
                break;
            }
        }
        if(Found==false){
            System.out.println("President not Found");
        }
    }

}
