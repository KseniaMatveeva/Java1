//12.Make a file HelloWorld.java that declares a class HelloWorld in a package ch01.sec01.
// Put it into some directory, but not in a ch01/sec01 subdirectory. From that directory,
// run javac HelloWorld.java. Do you get a class file? Where? Then run java HelloWorld.
// What happens? Why? (Hint: Run javap HelloWorld and study the warning message.)
// Finally, try javac -d HelloWorld.java. Why is that better?
/* public class No12 {

    Задание 12.
    Создаем пакет с названием No12.sec01
    В нем создаем файл с названием HelloWorld.java
    В нем класс HelloWorld
package No12.sec01;

    class HelloWord
    {
        public static void main(String[] args)
        {
            System.out.println("Hello World!");
        }
    }

    Далее создаем новый каталог (вручную в папке с лабами), но не внутри каталога No12.sec01 и кидаем туда наш файл.
    Заходим в cmd переходим в новый каталог и выполняем javac HelloWorld.java
    cd /Users/Ksu/IdeaProjects/Prog2/src/No1212
    В этом каталоге появился файл HelloWorld.class
    Создаем в этой же папке еще одну. Допустим «a»
    Затем выполняем команду javac -d a HelloWorld.java
    Теперь наш класс появился в папке a/No12/sec01
    По умолчанию компилятор записывает сгенерированный .class в тот же каталог, где находится исходный класс .java. Это хорошо для маленьких проектов, но при работе на больших проектах файлы .java и .class должны храниться отдельно.
    Ключ -d позволяет указать компилятору, куда записывать сгенерированные .class файлы.



}
*/