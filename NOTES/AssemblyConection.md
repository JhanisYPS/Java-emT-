## Command
```
javap -c MyFirstClass
```

### Answer
---
```
Compiled from "MyFirstClass.java"
public class MyFirstClass {
  public MyFirstClass();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String...);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #3                  // String Hello, World!
       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}
```
> Link: https://docs.oracle.com/en/java/javase/21/docs/specs/man/java.html#advanced-options-for-java