## String in Java

```
Definition ==> String in java, is a object which represent the sequence of the character.An Array of character represent the string. 

```

## for example 

> `char ch[] = {'j','i','g','n','e','s','h'}`
> `equal to same as String s = "jignesh"`


### java String class 
```provide a lot of methods to perform operations on string such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.```

**The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.**

# The way to impliment String 
```
The CharSequence interface is used to represent the sequence of characters.
String, StringBuffer and StringBuilder classes implement it. 
It means, we can create strings in Java by using these three classes.



```
***
##Note ==> 
 *  String is immutable which means it cannot be    changed
* Whenever we change any string, a new instance is created. 
*  For mutable strings, you can use StringBuffer and StringBuilder classes.

---

# How to Create a String  Object ? 

* There are two wasy to create String Object

1. By String literal (uses double quotes example=> String s "welcome", it is a memory efficient method )
2. By new Keyword (String s=new String("Welcome");//creates two objects and one reference variable  )


** Note: String objects are stored in a special memory area known as the "string constant pool".**

  
# java String list of method 


| NO. | Method                                         | Description                                                 |
|-----|------------------------------------------------|-------------------------------------------------------------|
| 1   | char charAt(int index)                         | Returns char value for the particular index.                |
| 2   | int length()                                   | Returns string length.                                      |
| 3   | static String format(String, Object... args)   | Returns a formatted string.                                 |
| 4   | static String format(Locale, String, Object... args) | Returns formatted string with given locale.               |
| 5   | String substring(int beginIndex)               | Returns substring for the given begin index.                |
| 6   | String substring(int beginIndex, int endIndex)  | Returns substring for the given begin and end indices.     |
| 7   | boolean contains(CharSequence s)              | Returns true or false after matching the sequence of char value. |
| 8   | static String join(CharSequence delimiter, CharSequence... elements) | Returns a joined string.                    |
| 9   | static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) | Returns a joined string.   |
| 10  | boolean equals(Object another)                | Checks the equality of the string with the given object.    |
| 11  | boolean isEmpty()                              | Checks if the string is empty.                              |
| 12  | String concat(String str)                      | Concatenates the specified string.                          |
| 13  | String replace(char old, char new)             | Replaces all occurrences of the specified char value.      |
| 14  | String replace(CharSequence old, CharSequence new) | Replaces all occurrences of the specified CharSequence. |
| 15  | static String equalsIgnoreCase(String another) | Compares another string without checking case.             |
| 16  | String[] split(String regex)                   | Returns a split string matching the regex.                 |
| 17  | String[] split(String regex, int limit)        | Returns a split string matching the regex and limit.       |
| 18  | String intern()                                | Returns an interned string.                                 |
| 19  | int indexOf(int ch)                            | Returns the specified char value index.                    |
| 20  | int indexOf(int ch, int fromIndex)             | Returns the specified char value index starting with the given index. |
| 21  | int indexOf(String substring)                  | Returns the specified substring index.                     |
| 22  | int indexOf(String substring, int fromIndex)   | Returns the specified substring index starting with the given index. |
| 23  | String toLowerCase()                           | Returns a string in lowercase.                             |
| 24  | String toLowerCase(Locale l)                   | Returns a string in lowercase using the specified locale.  |
| 25  | String toUpperCase()                           | Returns a string in uppercase.                             |
| 26  | String toUpperCase(Locale l)                   | Returns a string in uppercase using the specified locale.  |
| 27  | String trim()                                  | Removes beginning and ending spaces of this string.         |
| 28  | static String valueOf(int value)               | Converts given type into string. (Overloaded method)       |
