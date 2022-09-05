import  java.lang.Character.*;
public class VowelConsonant {



    void check(String str){


//        System.out.println(str);

        if(str=="a" ||  str=="i" || str=="e" || str=="o" || str=="u"||  str=="A" || str=="E" || str=="I" || str=="O" || str=="U"){
            System.out.println("Vowel");
        }
       else  if(str=="b" || str=="c" || str=="d" || str=="f" || str=="g" || str=="h" || str=="j" || str=="k" || str=="l" || str=="m" || str=="n" || str=="r" || str=="p" || str=="q" || str=="s" || str=="t" || str=="v" || str=="w" || str=="x" || str=="y" || str=="z"){

            System.out.println("Consonant");
        }
        else{
            System.out.println("Invalid character");

        }

    }

    public static void main(String[] args) {
        VowelConsonant obj=new VowelConsonant();
        obj.check("A");
        obj.check("b");
        obj.check("9");

    }
}
