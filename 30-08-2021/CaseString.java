public class CaseString {
public static void main (String[] args) {
String s1 = "stringone";
String s2 = "stringtwo";
String s3 = s1+s2+"NewString";
System.out.println(s3);
System.out.println(s3.toUpperCase());
System.out.println(s3.toLowerCase());
System.out.println(s3.replace('g', 'G'));
}
}
