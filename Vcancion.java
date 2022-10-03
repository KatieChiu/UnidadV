import java.util.Scanner;

public class Vcancion{
    public static void main(String[]args){
    Scanner entrada=new Scanner(System.in);
    int c;
    System.out.println("Escriba 1 si desea empezar la cancion: ");
    c=entrada.nextInt();

if (c==1){
    for (int i=0; i<13;i++){
        switch (i){
            case 1: 
                System.out.println("Cancion: Los doce dias de navidad "+"\n");
            break;
            case 2: 
                System.out.println("El primer día después de Navidad"+"\n"+
                                        "Mi amor me mandó" +"\n"+
                                     "Una perdiz en un peral. "+"\n");
            break;

            case 3: 
            System.out.println("El segundo día después de Navidad,"+"\n"+
                                    "Mi amor me mandó"+"\n"+
                                    "Dos tórtolas"+"\n"+
                                 "Y una perdiz en un peral."+"\n");
            break;

            case 4: 
                System.out.println("El tercer día después de Navidad,"+"\n"+
                                    "Mi amor me mandó"+"\n"+
                                    "Tres gallinas francesas,"+"\n"+
                                    "Dos tórtolas"+"\n"+
                                    "Y una perdiz en un peral."+"\n");
            break;
            case 5: 
                System.out.println(" El cuarto día después de Navidad,"+"\n"+
                                    "Mi amor me mandó"+"\n"+
                                    "Cuatro pájaros llamando,"+"\n"+
                                    "Tres gallinas francesas,"+"\n"+
                                    "Dos tórtolas"+"\n"+
                                    "Y una perdiz en un peral."+"\n");
            break;
            case 6: 
                System.out.println("El quinto día después de Navidad,"+"\n"+
                                     "Mi amor me mandó"+"\n"+
                                     "Cinco anillos de oro,"+"\n"+
                                     "Cuatro pájaros llamando,"+"\n"+
                                     "Tres gallinas francesas,"+"\n"+
                                     "Dos tórtolas"+"\n"+
                                     "Y una perdiz en un peral."+"\n");
            break;
            case 7: 
                System.out.println("El sexto día después de Navidad,"+"\n"+
                                    "Mi amor me mandó"+"\n"+
                                   "Seis ocas poniendo,"+"\n"+
                                    "Cinco anillos de oro,"+"\n"+
                                    "Cuatro pájaros llamando,"+"\n"+
                                    "Tres gallinas francesas,"+"\n"+
                                    "Dos tórtolas"+"\n"+
                                    "Y una perdiz en un peral."+"\n");
            break;
            case 8: 
                System.out.println("El séptimo día después de Navidad,"+"\n"+
                                "Mi amor me mandó"+"\n"+
                                " Siete cisnes nadando,"+"\n"+
                                "Seis ocas poniendo,"+"\n"+
                                "Cinco anillos de oro,"+"\n"+
                                "Cuatro pájaros llamando,"+"\n"+
                                "Tres gallinas francesas,"+"\n"+
                                "Dos tórtolas"+"\n"+
                              "Y una perdiz en un peral."+"\n");
            break;
            case 9: 
                System.out.println("El octavo día después de Navidad,"+"\n"+
                                 "Mi amor me mandó"+"\n"+
                                 "Ocho criadas ordeñando,"+"\n"+
                                 "siete cisnes nadando,"+"\n"+
                                 "Seis ocas poniendo,"+"\n"+
                                 "Cinco anillos de oro,"+"\n"+
                                 "Cuatro pájaros llamando,"+"\n"+
                                 "Tres gallinas francesas,"+"\n"+
                                 "Dos tórtolas"+"\n"+
                                 "Y una perdiz en un peral."+"\n");
            break;
            case 10: 
                System.out.println("El quinto día después de Navidad," +"\n"+
                                    "Mi amor me mandó"+"\n"+
                                    "Cinco anillos de oro,"+"\n"+
                                    "Cuatro pájaros llamando,"+"\n"+
                                    "Tres gallinas francesas,"+"\n"+
                                   "Dos tórtolas"+"\n"+
                                    "Y una perdiz en un peral."+"\n");
            break;
            case 11: 
                System.out.println("El noveno día después de Navidad,"+"\n"+
                                     "Mi amor me mandó"+"\n"+
                                        "Nueve señoras bailando,"+"\n"+
                                      "Ocho criadas ordeñando,"+"\n"+
                                     "Siete cisnes nadando,"+"\n"+
                                        "Seis ocas poniendo,"+"\n"+
                                        "Cinco anillos de oro,"+"\n"+
                                     "Cuatro pájaros llamando,"+"\n"+
                                        "Tres gallinas francesas," +"\n"+
                                     "Dos tórtolas"+"\n"+
                                     " Y una perdiz en un peral."+"\n");
            break;
            case 12: 
                System.out.println("El décimo día después de Navidad,"+"\n"+
                                        " Mi amor me mandó"+"\n"+
                                        "Diez señores brincando,"+"\n"+
                                        "Nueve señoras bailando,"+"\n"+
                                        "Ocho criadas ordeñando,"+"\n"+
                                        "Siete cisnes nadando,"+"\n"+
                                        "Seis ocas poniendo,"+"\n"+
                                        "Cinco anillos de oro,"+"\n"+
                                        "Cuatro pájaros llamando,"+"\n"+
                                        "Tres gallinas francesas,"+"\n"+
                                        "Dos tórtolas"+"\n"+
                                        "Y una perdiz en un peral.."+"\n");
            break;
            case 13: 
                System.out.println("El undécimo día después de Navidad,"+"\n"+
                                    "Mi amor me mandó"+"\n"+
                                    "Once gaiteros tocando,"+"\n"+
                                    "Diez señores brincando,"+"\n"+
                                    "Nueve señoras bailando,"+"\n"+
                                    "Ocho criadas ordeñando,"+"\n"+
                                    "Siete cisnes nadando,"+"\n"+
                                    "Seis ocas poniendo,"+"\n"+
                                    "Cinco anillos de oro,"+"\n"+
                                    "Cuatro pájaros llamando,"+"\n"+
                                    "Tres gallinas francesas,"+"\n"+
                                    "Dos tórtolas"+"\n"+
                                    " Y una perdiz en un peral."+"\n");
            break;
            case 14: 
                System.out.println("El duodécimo día después de Navidad,"+"\n"+
                                    "Mi amor me mandó"+"\n"+
                                    "Doce tamborileros tamboreando,"+"\n"+
                                    "Once gaiteros tocando,"+"\n"+
                                    "Diez señores brincando,"+"\n"+
                                    "Nueve señoras bailando,"+"\n"+
                                    "Ocho criadas ordeñando,"+"\n"+
                                    "Siete cisnes nadando,"+"\n"+
                                    "Seis ocas poniendo,"+"\n"+
                                    "Cinco anillos de oro,"+"\n"+
                                    "Cuatro pájaros llamando,"+"\n"+
                                    "Tres gallinas francesas,"+"\n"+
                                    "Dos tórtolas"+"\n"+
                                    "Y una perdiz en un peral."+"\n");
            break;




        }
    }
}



entrada.close();







}
}