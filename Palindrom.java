class Palindrom {
    public static void main(String[]args){
        String name1 = "madam";
        String name2 = "";
        int len = name1.length();
        for(int i=len-1;i>=0;i--){
            name2 = name2+name1[i];
        }
        if (name1.equals(name2)){
            System.out.println("It is palindrom");
        }
        else {
            System.out.println("Not Panlindrom");
        }
    }
}