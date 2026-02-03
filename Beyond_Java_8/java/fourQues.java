/*
Demonstrate the use of repeat(),
 strip(),trim(), isBlank(),
 indent(), transform(), stripIndent(),
 translateEscapes(),tripleQuotes and formatted() methods.
 */
public class fourQues {
    public static void main(String[] args) {
        String str = "\u2003  Hello By \" Padam Awasthi   \u2003";
        System.out.println(str);

        // it print same string 2 times
        System.out.println(str.repeat(2));

        // it remove blank spaces from starting and last inclding unicode spaces
        System.out.println(str.strip());

        //trim it remove spaces from starting and ending but not remove unicode spaces \u2003 type
        System.out.println(str.trim());

        String spaceString = " \t  \n ";
        //isBlank - tell that string is empty or not
        //isEmpty - tell that string is empty but consider spaces also as words
        System.out.println(spaceString.isBlank());
        System.out.println(spaceString.isEmpty());

        String str2= "123";
        //transform convert string to other data type
        int convertedInt = str2.transform(Integer::parseInt);
        System.out.println(convertedInt);

        //indent -- adds or remove spaces in ending or starting +ve no. in starting and -ve in ending
        String str3= "Hello by Indent";
        System.out.println(str3.indent(20));
        //output -                     Hello by Indent

        //stripIndent- Cleans unwanted indentation
        String stripInd= """
                Hello by 
                   n  
                stripIndent""";
        System.out.println(stripInd.stripIndent());


        //translateEscape- Converts escape sequences (\n, \t, \") into actual characters we can also print " in output with this
        String translate= "hello by \n translate \"  ";


        //triple Quotes - in java 15  multi line strings , to print output as written inside triple quotes
        String tripleQuote= """
                Hello by 
                   n  
                stripIndent""";
        System.out.println(tripleQuote);

        //formatted - modern alternative to String.format
        String name = "Padam Awasthi";
        int age =24;
        String format="The name = %s and age = %d".formatted(name,age);
        System.out.println(format);
    }
}
