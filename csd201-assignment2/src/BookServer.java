/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUNGHUYNH
 */
public class BookServer {
    
    BookService service;
    String fname;
    String[] bookNames = {"Don Quixote",
        "Alice's Adventures in Wonderland",
        "The Adventures of Huckleberry Finn",
        "The Adventures of Tom Sawyer",
        "Treasure Island",
        "Pride and Prejudice",
        "Wuthering Heights",
        "Jane Eyre",
        "Moby Dick",
        "The Scarlet Letter",
        "Gulliver's Travels",
        "The Pilgrim's Progress",
        "A Christmas Carol",
        "David Copperfield",
        "A Tale of Two Cities",
        "Little Women",
        "Great Expectations",
        "The Hobbit, or, There and Back Again",
        "Frankenstein, or, the Modern Prometheus",
        "Oliver Twist",
        "Uncle Tom's Cabin",
        "Crime and Punishment",
        "Madame Bovary: Patterns of Provincial life",
        "The Return of the King",
        "Dracula",
        "The Three Musketeers",
        "Brave New World",
        "War and Peace",
        "To Kill a Mockingbird",
        "The Wizard of Oz",
        "Les Misérables",
        "The Secret Garden",
        "Animal Farm",
        "The Great Gatsby",
        "The Little Prince",
        "The Call of the Wild",
        "20,000 Leagues Under the Sea",
        "Anna Karenina",
        "The Wind in the Willows",
        "The Picture of Dorian Gray",
        "The Grapes of Wrath",
        "Sense and Sensibility",
        "The Last of the Mohicans",
        "Tess of the d'Urbervilles",
        "Harry Potter and the Sorcerer's Stone",
        "Heidi",
        "Ulysses",
        "The Complete Sherlock Holmes",
        "The Count of Monte Cristo",
        "The Old Man and the Sea",
        "The Lion, the Witch, and the Wardrobe",
        "The Hunchback of Notre Dame",
        "Pinocchio",
        "One Hundred Years of Solitude",
        "Ivanhoe",
        "The Red Badge of Courage",
        "Anne of Green Gables",
        "Black Beauty",
        "Peter Pan",
        "A Farewell to Arms",
        "The House of the Seven Gables",
        "Lord of the Flies",
        "The Prince and the Pauper",
        "A Portrait of the Artist as a Young Man",
        "Lord Jim",
        "Harry Potter and the Chamber of Secrets",
        "The Red & the Black",
        "The Stranger",
        "The Trial",
        "Lady Chatterley's Lover",
        "Kidnapped: The Adventures of David Balfour",
        "The Catcher in the Rye",
        "Fahrenheit 451",
        "A Journey to the Center of the Earth",
        "Vanity Fair",
        "All Quiet on the Western Front",
        "Gone with the Wind",
        "My Ántonia",
        "Of Mice and Men",
        "The Vicar of Wakefield",
        "A Connecticut Yankee in King Arthur's Court",
        "White Fang",
        "Fathers and Sons",
        "Doctor Zhivago",
        "The Decameron",
        "Nineteen Eighty-Four",
        "The Jungle",
        "The Da Vinci Code",
        "Persuasion",
        "Mansfield Park",
        "Candide",
        "For Whom the Bell Tolls",
        "Far from the Madding Crowd",
        "The Fellowship of the Ring",
        "The Return of the Native",
        "Sons and Lovers",
        "Charlotte's Web",
        "The Swiss Family Robinson",
        "Bleak House",
        "Père Goriot",
        "Utopia",
        "The History of Tom Jones, a Foundling",
        "Harry Potter and the Prisoner of Azkaban",
        "Kim",
        "The Sound and the Fury",
        "Harry Potter and the Goblet of Fire",
        "The Mill on the Floss",
        "A Wrinkle in Time",
        "The Hound of the Baskervilles",
        "The Two Towers",
        "The War of the Worlds",
        "Middlemarch",
        "The Age of Innocence",
        "The Color Purple",
        "Northanger Abbey",
        "East of Eden",
        "On the Road",
        "Catch-22",
        "Around the World in Eighty Days",
        "Hard Times",
        "Beloved",
        "Mrs. Dalloway",
        "To the Lighthouse",
        "The Magician's Nephew",
        "Harry Potter and the Order of the Phoenix",
        "The Sun Also Rises",
        "The Good Earth",
        "Silas Marner",
        "Love in the Time of Cholera",
        "Rebecca",
        "Jude the Obscure",
        "Twilight",
        "A Passage to India",
        "The Plague",
        "Nicholas Nickleby",
        "The Pearl",
        "Ethan Frome",
        "The Tale of Genji",
        "The Giver",
        "The Alchemist",
        "The Strange Case of Dr. Jekyll and Mr. Hyde",
        "Robinson Crusoe",
        "Tender is the Night",
        "The Idiot",
        "Hatchet",
        "The Kite Runner",
        "One Flew Over the Cuckoo's Nest",
        "The Portrait of a Lady",
        "The Outsiders",
        "Ben-Hur",
        "The Mayor of Casterbridge",
        "Cry, The Beloved Country",
        "The Last Battle",
        "Captains Courageous",
        "The Castle",
        "The Metamorphosis",
        "The Magic Mountain (Der Zauberberg)",
        "James and the Giant Peach",
        "The Horse and His Boy",
        "Angels & Demons",
        "The Voyage of the Dawn Treader",
        "The Bell Jar",
        "Women in Love",
        "The Yearling",
        "O Pioneers!",
        "The Handmaid's Tale",
        "The Moonstone",
        "The Old Curiosity Shop",
        "Little Dorrit",
        "Prince Caspian: The Return to Narnia",
        "Sister Carrie",
        "The Silver Chair",
        "The Hunger Games",
        "This Side of Paradise",
        "Eugénie Grandet",
        "Of Human Bondage",
        "Dream of the Red Chamber",
        "Life of Pi",
        "Harry Potter and the Deathly Hallows",
        "Invisible Man",
        "Steppenwolf",
        "The Sorrows of Young Werther",
        "Bridge to Terabithia",
        "The Invisible Man",
        "Holes",
        "Siddhartha",
        "A Tree Grows in Brooklyn",
        "Through the Looking-Glass, and What Alice Found There",
        "In Cold Blood",
        "The House of the Spirits",
        "Adam Bede",
        "The Betrothed",
        "The Book Thief",
        "Their Eyes Were Watching God",
        "One Day in the Life of Ivan Denisovich",
        "The Sea Wolf",
        "Catching Fire",
        "Roll of Thunder, Hear My Cry",
        "Death Comes for the Archbishop",
        "The House of Mirth",
        "Light in August",
        "The Pickwick Papers",
        "Remembrance of Things Past",
        "Barchester Towers and the Warden",
        "The Bridge of San Luis Rey",
        "The Help",
        "Murder on the Orient Express",
        "The Lovely Bones",
        "The Appeal",
        "Dombey And Son",
        "Slaughterhouse-Five",
        "An American Tragedy",
        "The Bluest Eye",
        "Little House In the Big Woods",
        "Pippi Longstocking",
        "Germinal",
        "The Heart Is a Lonely Hunter",
        "The Woman In White",
        "Absalom, Absalom!",
        "A Painted House",
        "The Girl With the Dragon Tattoo",
        "A Room With a View",
        "Watership Down",
        "Memoirs of a Geisha",
        "Our Mutual Friend",
        "Babbitt",
        "The Red Pony",
        "All the King's Men",
        "Things Fall Apart",
        "Lorna Doone",
        "Johnny Tremain",
        "Anne of Avonlea",
        "Tuck Everlasting",
        "The BFG",
        "Cannery Row",
        "The Joy Luck Club",
        "The Silmarillion",
        "Roots",
        "Little House on the Prairie",
        "Native Son",
        "Stuart Little",
        "Cross Fire",
        "The Power and the Glory",
        "A Clockwork Orange",
        "The Phantom of the Opera",
        "The Martian Chronicles",
        "The Road",
        "The Way of All Flesh",
        "Diary of a Wimpy Kid: The Long Haul",
        "Villette",
        "The Curious Incident of the Dog In the Night-Time",
        "The Mysterious Island",
        "Song of Solomon",
        "Nana",
        "Quo Vadis",
        "Main Street",
        "Matilda",
        "Lolita",
        "Paper Towns",
        "Sounder",
        "Are You There God? It's Me, Margaret",
        "The Notebook",
        "From the Mixed-Up Files of Mrs. Basil E. Frankweiler",
        "Atlas Shrugged",
        "The Fountainhead",
        "Number the Stars",
        "The Firm",
        "Swann's Way",
        "Ender's Game",
        "The Name of the Rose",
        "A Time to Kill",
        "Water for Elephants",
        "The Time Machine",
        "Eragon",
        "The Hitchhiker's Guide to the Galaxy",
        "Buddenbrooks",
        "A Thousand Splendid Suns",
        "The Witch of Blackbird Pond",
        "And Then There Were None",
        "A Separate Peace",
        "Breaking Dawn",
        "As I Lay Dying",
        "The Girl Who Played With Fire",
        "Where the Red Fern Grows",
        "Le Morte D'Arthur",
        "Mockingjay",
        "The Pillars of the Earth",
        "Persian Letters",
        "The Client",
        "Sula",
        "Tales of a Fourth Grade Nothing",
        "The Merry Adventures of Robin Hood of Great Renown In Nottinghamshire",
        "Tortilla Flat",
        "Look Homeward, Angel",
        "The Mystery of Edwin Drood",
        "Brideshead Revisited",
        "The Pelican Brief",
        "Atonement",
        "Washington Square",
        "Like Water for Chocolate",
        "The Golden Compass",
        "The Secret Life of Bees",
        "The Fault In Our Stars",
        "Nostromo",
        "Finnegans Wake",
        "The Brethren",
        "Coraline",
        "Heart of Darkness",
        "On the Banks of Plum Creek",
        "Rebecca of Sunnybrook Farm",
        "The Ambassadors",
        "The Secret Agent",
        "The House on Mango Street",
        "Go Tell It on the Mountain",
        "The Testament",
        "The Clan of the Cave Bear",
        "Cranford",
        "Because of Winn-Dixie",
        "My Side of the Mountain",
        "The Runaway Jury",
        "The Mouse and the Motorcycle",
        "The Lost Symbol",
        "The Forsyte Saga",
        "Gone Girl",
        "The Lightning Thief",
        "The Last Days of Pompeii",
        "The Reader",
        "Caddie Woodlawn",
        "The Tale of Despereaux",
        "The Girl Who Kicked the Hornet's Nest",
        "Dear Mr. Henshaw",
        "The Killer Angels",
        "Chronicle of a Death Foretold",
        "The Five People You Meet In Heaven",
        "The Master and Margarita",
        "Winesburg, Ohio",
        "\"P\" Is for Peril",
        "My Sister's Keeper",
        "Barnaby Rudge",
        "Howards End",
        "The Broker",
        "The Camel Club",
        "The Rainbow",
        "The Man In the Iron Mask",
        "Mary Poppins",
        "Artemis Fowl",
        "Dear John",
        "Cold Mountain",
        "Flowers for Algernon",
        "The Dark Is Rising",
        "Resurrection",
        "Fearless Fourteen",
        "A Sentimental Journey Through France and Italy",
        "The King of Torts",
        "The Graveyard Book",
        "The Quiet American",
        "The Chamber",
        "The English Patient",
        "Snow Falling on Cedars",
        "The Long Winter",
        "Sarah, Plain and Tall",
        "Cross Country",
        "The Spy Who Came In from the Cold",
        "A Game of Thrones",
        "The Thorn Birds",
        "Old Yeller",
        "Ramona Quimby, Age 8",
        "Death In Venice",
        "By the Shores of Silver Lake",
        "Inferno",
        "Schindler's List",
        "Jonathan Livingston Seagull",
        "The Stand",
        "The Last Juror",
        "Shiloh",
        "Girl With a Pearl Earring",
        "The Murder of Roger Ackroyd",
        "It",
        "The Rainmaker",
        "The Poisonwood Bible",
        "The Indian in the Cupboard",
        "The Maltese Falcon",
        "The Warden",
        "The Summons",
        "Encyclopedia Brown: Boy Detective",
        "The Time Traveler's Wife",
        "The Incredible Journey",
        "Daughter of Fortune",
        "Shirley",
        "Bud, Not Buddy",
        "The Horse Whisperer",
        "The Street Lawyer",
        "Nausea",
        "To Have and Have Not",
        "The Bridges of Madison County",
        "Anne of the Island",
        "The Winter of Our Discontent",
        "The Shining",
        "The Tenant of Wildfell Hall",
        "First Family",
        "The Partner",
        "The Girl on the Train",
        "The Black Arrow: A Tale of the Two Roses",
        "The Rise of Silas Lapham",
        "The Choice",
        "The Virginian: A Horseman of the Plains",
        "A Walk to Remember",
        "The Maze Runner",
        "The Westing Game",
        "Misty of Chincoteague",
        "Diary of a Wimpy Kid: The Last Straw",
        "King Solomon's Mines",
        "The Princess of Cleves",
        "Jacob Have I Loved",
        "Mrs. Frisby and the Rats of NIMH",
        "Misery",
        "The Cider House Rules",
        "King of the Wind",
        "The Once and Future King",
        "The Witches",
        "The Subtle Knife",
        "When You Reach Me",
        "Carrie",
        "The Moon and Sixpence",
        "The Higher Power of Lucky",
        "Looking Backward, 2000-1887",
        "The Wings of the Dove",
        "The Summer of the Swans",
        "Dangerous Liaisons",
        "Jurassic Park",
        "The Absolutely True Diary of a Part-time Indian",
        "The Grey King",
        "The Leopard",
        "The Mammoth Hunters",
        "The Trumpet of the Swan",
        "The Lucky One",
        "These Happy Golden Years",
        "Arrowsmith",
        "Julie of the Wolves",
        "The Screwtape Letters",
        "The Fall",
        "The No. 1 Ladies' Detective Agency",
        "Worst Case",
        "Lost Horizon",
        "The Gunslinger",
        "The Slave Dancer",
        "Harry Potter and the Half-Blood Prince",
        "Inkheart",
        "Ramona and her Father",
        "Inkspell",
        "Ramona the Pest",
        "Walk Two Moons",
        "Miss Peregrine's Home for Peculiar Children",
        "The Chocolate War",
        "Sophie's Choice",
        "Looking for Alaska",
        "Breakfast at Tiffany's",
        "The Razor's Edge",
        "Dreamcatcher",
        "Orlando",
        "The Things they Carried",
        "Little Town on the Prairie",
        "Nights in Rodanthe",
        "The Amber Spyglass",
        "The Miraculous Journey of Edward Tulane",
        "Flatland",
        "Diary of a Wimpy Kid",
        "The Memory Keeper's Daughter",
        "The Wedding",
        "Fried Green Tomatoes at the Whistle-Stop Cafe",
        "The Cricket in Times Square",
        "The Phantom Tollbooth",
        "Rob Roy",
        "The Death of Ivan Ilych",
        "Alex Cross's Trial",
        "Kenilworth",
        "The Life and Opinions of Tristram Shandy",
        "The Remains of theDay",
        "M.C. Higgins, The Great",
        "Call It Courage",
        "Go Set a Watchman",
        "Bleachers",
        "Elijah of Buxton",
        "Swimsuit",
        "Cat's Cradle",
        "The Caine Mutiny",
        "The Heart of the Matter",
        "Harriet, the Spy",
        "Darkness at Noon",
        "A Prayer for Owen Meany",
        "The God of Small Things",
        "The Associate",
        "The Shack",
        "The Naked and the Dead",
        "The Sea of Monsters",
        "Stranger in a Strange Land",
        "Vision in White",
        "The Whipping Boy",
        "Room",
        "Deception Point",};
    
    public void setService(BookService service){
        this.service = service;
    }
    
    public void setFile(String fname){
        this.fname = fname;
    }
    
    void print(String s){
        System.out.print(s + "\n");

    }
    
    void print(Book b){
        System.out.print(b + "\n");           
    }
    
    void print(int num){
        System.out.print(num + "\n");           
    }
    
    void testCase1(){
        
        //simple case
        
        Book a = new Book("A","Book A",10,20,200000);
        Book b = new Book("B","Book B",14,20,250000);
        Book c = new Book("C","Book C",40,40,300000);
        Book d = new Book("D","Book D",22,22,1200000);
        
        print("===1. addBook");
        print("===" + service.addBook(c));        
        print("===" + service.addBook(a));
        print("===" + service.addBook(b));
        print("===" + service.addBook(d));
        print("===" + service.addBook(c));        
        
        print("===2. showBook 1");
        service.showBook(1);
        
        print("===3. showBook 2");        
        service.showBook(2);
        
        
        print("===4. countBook");
        print(service.countBook());
        
        print("===5. printAvailableBook");
        service.printAvailableBook();
        
        print("===6. balancing");
        service.balancing();
        
        print("===countBook");
        print(service.countBook()); 
        
        print("===showBook 2");        
        service.showBook(2);        
    }
    
    void testCase2(){
        
        // empty tree
        
        print("===1. addBook");     
        
        print("===2. showBook 1");
        service.showBook(1);
        
        print("===3. showBook 2");        
        service.showBook(2);
        
        
        print("===4. countBook");
        print(service.countBook());
        
        print("===5. printAvailableBook");
        service.printAvailableBook();
        
        print("===6. balancing");
        service.balancing();
        print("===countBook");
        print(service.countBook());        
        print("===showBook 2");
        
        service.showBook(2);        
    }
    
    void testCase3(){
        
        //not balance tree
        
        Book a = new Book("A","Book A",10,20,200000);
        Book b = new Book("B","Book B",14,20,250000);
        Book c = new Book("C","Book C",40,40,300000);
        Book d = new Book("D","Book D",33,33,1200000);
        Book e = new Book("E","Book E",40,40,300000);
        Book f = new Book("F","Book F",22,22,1200000);
        Book g = new Book("G","Book G",12,40,300000);
        Book h = new Book("H","Book H",22,22,1200000);
        
        print("===1. addBook");
        print("===" + service.addBook(a));
        print("===" + service.addBook(b));
        print("===" + service.addBook(c)); 
        print("===" + service.addBook(d));
        print("===" + service.addBook(e));
        print("===" + service.addBook(f));
        print("===" + service.addBook(g));
        print("===" + service.addBook(h)); 
        print("===" + service.addBook(a));
        print("===" + service.addBook(b));
        print("===" + service.addBook(c)); 
        print("===" + service.addBook(d));
        print("===" + service.addBook(e));
        print("===" + service.addBook(f));
        print("===" + service.addBook(g));
        print("===" + service.addBook(h)); 
        
        print("===2. showBook 1");
        
        service.showBook(1);
        
        print("===3. showBook 2");
        
        service.showBook(2);
        
        
        print("===4. countBook");
        print(service.countBook());
        
        print("===5. printAvailableBook");
        service.printAvailableBook();
        
        print("===6. balancing");
        service.balancing();
        print("===countBook");
        print(service.countBook());        
        print("===showBook 2");
        
        service.showBook(2);        
    }
    
    void testCase4(){
        
        //not balance tree
        
        Book a = new Book("A","Book A",10,20,200000);
        Book b = new Book("B","Book B",14,20,250000);
        Book c = new Book("C","Book C",40,40,300000);
        Book d = new Book("D","Book D",33,33,1200000);
        Book e = new Book("E","Book E",40,40,300000);
        Book f = new Book("F","Book F",22,22,1200000);
        Book g = new Book("G","Book G",12,40,300000);
        Book h = new Book("H","Book H",22,22,1200000);
        
        print("===1. addBook");
        print("===" + service.addBook(d));
        print("===" + service.addBook(b));
        print("===" + service.addBook(a));
        print("===" + service.addBook(c)); 
        print("===" + service.addBook(g));
        print("===" + service.addBook(e));
        print("===" + service.addBook(g));
        print("===" + service.addBook(a));
        print("===" + service.addBook(c));        
        print("===" + service.addBook(e));        
        print("===" + service.addBook(h)); 
        print("===" + service.addBook(f));
        

        
        print("===2. showBook 1");
        
        service.showBook(1);
        
        print("===3. showBook 2");
        
        service.showBook(2);
        
        
        print("===4. countBook");
        print(service.countBook());
        
        print("===5. printAvailableBook");
        service.printAvailableBook();
        
        print("===6. balancing");
        service.balancing();
        print("===countBook");
        print(service.countBook());        
        print("===showBook 2");
        
        service.showBook(2);        
    }
    
    void testCase5(){
        
    
        
        //not balance tree
        print("===1. addBook");
        
        for (int i = 0; i< 255; i++){
            Book a = new Book(MD5(bookNames[i]), bookNames[i],  25, (i % 30) + 25, 120000 +(i % 30)*3);
            print("===" + service.addBook(a));
        }
        
       
        print("===2. showBook 1");
        
        service.showBook(1);
        
        print("===3. showBook 2");
        
        service.showBook(2);
        
        
        print("===4. countBook");
        print(service.countBook());
        
        print("===5. printAvailableBook");
        service.printAvailableBook();
        
        print("===6. balancing");
        service.balancing();
        print("===countBook");
        print(service.countBook());
        print("===showBook 2");
        
        service.showBook(2);        
    }    

    
    void testCase6(){
        
    

        //not balance tree
        
        Book a = new Book("A","Book A",10,20,200000);
        Book b = new Book("B","Book B",14,20,250000);
        Book c = new Book("C","Book C",40,40,300000);
        Book d = new Book("D","Book D",33,33,1200000);
        Book e = new Book("E","Book E",40,40,300000);
        Book f = new Book("F","Book F",22,22,1200000);
        Book g = new Book("G","Book G",12,40,300000);
        Book h = new Book("H","Book H",22,22,1200000);
        Book i = new Book("I","Book I",40,40,300000);
        Book j = new Book("J","Book J",22,22,1200000);
        Book k = new Book("K","Book K",12,40,300000);
        Book l = new Book("L","Book L",22,22,1200000); 
        Book m = new Book("M","Book M",22,22,1200000);
        Book n = new Book("N","Book N",22,22,1200000);        
        
        
        print("===0. addBook");
        print("===" + service.addBook(h));
        print("===" + service.addBook(d));
        print("===" + service.addBook(b));
        print("===" + service.addBook(a)); 
        print("===" + service.addBook(c));  
        print("===" + service.addBook(f));            
        print("===" + service.addBook(e)); 
        print("===" + service.addBook(g)); 
        print("===" + service.addBook(i));         
        print("===" + service.addBook(j));
        print("===" + service.addBook(m));
        print("===" + service.addBook(n));      
        print("===" + service.addBook(l));        
        print("===" + service.addBook(k));  
        
        
        print("===7. searchBookbyCode - 3 tests");
        print(service.searchBookbyCode("B"));
        print(service.searchBookbyCode("U"));
        print(service.searchBookbyCode("A"));
        
        print("===8. removeBook - 3 test");
        service.removeBook("C");
        service.removeBook("B");
        service.removeBook("M");
        print("===countBook");
        print(service.countBook());
        print("===showBook 2");
        
        service.showBook(2);     

        
        print("===9. searchBookbyName - 3 test");
        print(service.searchBookbyName("Book H"));
        print(service.searchBookbyName("Book A"));        
        print(service.searchBookbyName("Book C"));


    }    
    
    
    void testCase7(){
        
    

        print("===addBook");
        
        for (int i = 0; i< 500; i++){
            Book a = new Book(MD5(bookNames[i]), bookNames[i],  25, (i % 30) + 25, 120000 +(i % 30)*3);
            service.addBook(a);
        }
        

        
        print("===7. searchBookbyCode - 2 tests");
        print(service.searchBookbyCode(MD5("A Game of Thrones")));
        print(service.searchBookbyCode(MD5("The Thorn Birds")));

        
        print("===8. removeBook - 2 tests");
        print("===countBook- before removal");
        print(service.countBook());  

        service.removeBook(MD5("A Game of Thrones"));
        service.removeBook(MD5("The Thorn Birds"));

        print("===countBook- after removal");
        print(service.countBook());     

        
        print("===9. searchBookbyName - 2 tests");
        print(service.searchBookbyName("A Game of Thrones"));
        print(service.searchBookbyName("The Thorn Birds"));        


    }    

public String MD5(String md5) {
   try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        byte[] array = md.digest(md5.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
       }
        return sb.toString();
    } catch (java.security.NoSuchAlgorithmException e) {
    }
    return null;
}
    public void process(int testcase){

        PrintStream stdout = System.out;
        File file = new File(fname);
        //Instantiating the PrintStream class

        try {
            PrintStream stream = new PrintStream(file);
            System.setOut(stream);
        } catch (FileNotFoundException ex) {
            System.out.println("File is not able to write");
        }


        
        switch (testcase) {
            case 1: testCase1(); break;
            case 2: testCase2(); break;
            case 3: testCase3(); break;
            case 4: testCase4(); break;
            case 5: testCase5(); break;
            case 6: testCase6(); break;
            case 7: testCase7(); break;          
        }
        
        System.setOut(stdout);
    }
}
