using System.Text;
using System.Threading.Channels;

string s = "Bonjour tout le monde. ";
//Remplacer la lettre o par la lettre a
string s1 = s.Replace('o', 'a');
Console.WriteLine(s1);
//Remplacer une chaîne par une autre
string s2 = s.Replace("t le monde", "s les etudiants");
Console.WriteLine(s2);

//diviser la chaîne en des sous-chaînes en utilisant l'espace comme 
//séparateur
string[] tab = s.Split(" ");
foreach (string ss in tab)
{
    Console.WriteLine(ss);
}
//extraire la chaîne à partir du caractère à l'index 5 jusqu'à la fin
string s3 = s.Substring(5);
Console.WriteLine(s3);
//extraire les 9 caractères de la chaîne à partir du caractère à 
//l'index 5 
string s4 = s.Substring(5, 9);
Console.WriteLine(s4);
//Convertir la chaîne en majuscule
string s5 = s.ToUpper();
Console.WriteLine(s5);
//Convertir la chaîne en minuscule
string s6 = s.ToLower();
Console.WriteLine(s6);
//Enlever les espaces de début et de fin
string s7 = s.Trim();
s7 = s7.Replace(' ', '*');
Console.WriteLine(s7);


// Créez un StringBuilder qui prévoit de contenir 50 caractères.
// Initialisez le StringBuilder avec "ABC".

StringBuilder sb = new StringBuilder("ABC", 50);
// Ajoutez trois caractères (D, E et F) à la fin de StringBuilder.
sb.Append(new char[] { 'D', 'E', 'F' });
// Ajoutez une chaîne formatée à la fin de StringBuilder..
sb.AppendFormat("GHI{0}{1}", 'J', 'k');
// Afficher le nombre de caractères dans le StringBuilder et sa  chaîne
Console.WriteLine("{0} chars: {1}", sb.Length, sb.ToString());
// Insérez une chaîne au début de StringBuilder.
sb.Insert(0, "Alphabet: ");
// Remplacez tous les k minuscules par des K majuscules..
sb.Replace('k', 'K');
// Afficher le nombre de caractères dans le StringBuilder et sa  chaîne.
Console.WriteLine("{0} chars: {1}", sb.Length, sb.ToString());

Console.ReadKey();

Console.WriteLine(Math.Abs(-5)); //5
Console.WriteLine(Math.Abs(10)); //10
Console.WriteLine(Math.Cos(0)); //1
Console.WriteLine(Math.Sin(Math.PI / 2)); //1
Console.WriteLine(Math.Min(5, 1)); //1
Console.WriteLine(Math.Max(9, 5)); //6
Console.WriteLine(Math.Round(5.2)); //5
Console.WriteLine(Math.Round(5.5)); //6