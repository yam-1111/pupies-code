
// name and input format


using System;

class name
{
    public static void Main(string[] args)
    {
        string name, nickname, bday, address, mbti, zodiac, section, color, favorite_book_in_bible, random_hobbies, aspiration, birth_address, totga_course, curr_school, shs_school, high_school, elem_school;
        int age;
        double radio_station;

        /**** input ****/
        Console.Write("Enter your name: ");
        name = Console.ReadLine();
        Console.Write("Enter your nickname: ");
        nickname = Console.ReadLine();
        Console.Write("Enter your birthday: ");
        bday = Console.ReadLine();
        Console.Write("Enter your age: ");
        age = int.Parse(Console.ReadLine());
        Console.Write("Enter your address: ");
        address = Console.ReadLine();
        Console.Write("Enter your MBTI: ");
        mbti = Console.ReadLine();
        Console.Write("Enter your zodiac sign: ");
        zodiac = Console.ReadLine();
        Console.Write("Enter your section: ");
        section = Console.ReadLine();
        Console.Write("Enter your favorite color: ");
        color = Console.ReadLine();
        Console.Write("Enter your favorite book in the bible: ");
        favorite_book_in_bible = Console.ReadLine();

        Console.Write("Enter your aspiration: ");
        aspiration = Console.ReadLine();
        Console.Write("Enter your birth address: ");
        birth_address = Console.ReadLine();
        Console.Write("Enter your random hobbies: ");
        random_hobbies = Console.ReadLine();
        Console.Write("Enter your TOTGA course: ");
        totga_course = Console.ReadLine();
        Console.Write("Enter your favorite radio station: ");
        radio_station = double.Parse(Console.Read());

        Console.Write("Enter your current school: ");
        curr_school = Console.ReadLine();
        Console.Write("Enter your SHS school: ");
        shs_school = Console.ReadLine();
        Console.Write("Enter your high school: ");
        high_school = Console.ReadLine();
        Console.Write("Enter your elementary school: ");
        elem_school = Console.ReadLine();

        /**** output ****/
        Console.WriteLine("+++++++++++++++++++");
        Console.WriteLine("---------- Biography ----------");
        Console.WriteLine($"Name: {name}");
        Console.WriteLine($"Nickname: {nickname}");
        Console.WriteLine($"Birthday: {bday}");
        Console.WriteLine($"Age: {age}");
        Console.WriteLine($"Address: {address}");
        Console.WriteLine($"MBTI: {mbti}");
        Console.WriteLine($"Zodiac: {zodiac}");
        Console.WriteLine($"Section: {section}");
        Console.WriteLine($"Favorite color: {color}");
        Console.WriteLine($"Favorite book in the bible: {favorite_book_in_bible}");
        Console.WriteLine($"Aspiration: {aspiration}");
        Console.WriteLine($"Birth address: {address}");
        Console.WriteLine($"Random hobbies: {random_hobbies}");
        Console.WriteLine($"TOTGA course: {totga_course}");
        Console.WriteLine($"Favorite radio station: {radio_station}");

        Console.WriteLine("-------- School --------");
        Console.WriteLine($"Current school: {curr_school}");
        Console.WriteLine($"SHS school: {shs_school}");
        Console.WriteLine($"High school: {high_school}");
        Console.WriteLine($"Elementary school: {elem_school}");
        Console.WriteLine("+++++++++++++++++++");




    }
}