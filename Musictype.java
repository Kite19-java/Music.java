package musictype;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Musictype {

    
    public static void main(String[] args) throws LineUnavailableException {
        ArrayList<String> list = new ArrayList<>();
        Scanner s = new Scanner (System.in);
        
        
        
        
        System.out.println("Hello! Please Pick a music Below\n");
        System.out.println("------------------------------------------------------------");
        
        list.add("1.Lihim ");        
        list.add(" 2.Obsessed ");
        list.add(" 3.New Jeans ");
        list.add(" 4. Paubaya");
        
        
        
        
        System.out.println(list);
        
        
        System.out.println("------------------------------------------------------------");
        System.out.print("Enter a Number: ");
        int choice = s.nextInt();
        
        
       
        String music =  "C:\\Users\\Win_10\\Desktop\\CodeMusic\\Lihim.wav";
        
        String music1 =  "C:\\Users\\Win_10\\Desktop\\CodeMusic\\Obsessed.wav";
        
        String music2 =  "C:\\Users\\Win_10\\Desktop\\CodeMusic\\New Jeans.wav";
        
        String music3 = "C:\\Users\\Win_10\\Desktop\\CodeMusic\\Paubaya.wav";
        
        
        Path pathfile = Paths.get(music);
        
        
        
        File one = new File (music);
        
        File two =  new File (music1);
        
        File three = new File(music2);
        
        File four = new File(music3);
        
      
             try( AudioInputStream type = AudioSystem.getAudioInputStream(one);
                AudioInputStream type2 = AudioSystem.getAudioInputStream(two);
                        AudioInputStream type3 = AudioSystem.getAudioInputStream(three);
                     AudioInputStream type4 = AudioSystem.getAudioInputStream(four)){
                 
                 BasicFileAttributes bute = Files.readAttributes(pathfile, BasicFileAttributes.class);
                 
               
                 
                 
                 
           switch(choice){
               case 1:
                   System.out.println("Playing Lihim.....");
                   System.out.println("Creation Time: "+bute.creationTime());
                   System.out.println("Size of the music: "+bute.size());
                   System.out.println("Last Opened: "+bute.lastAccessTime());
                   System.out.println("Properties "+ bute.toString());
                   System.out.println("--------------------------------------------");
                   System.out.println("The Lyrics: \n");
                   Songlyrics lyrics = new Songlyrics();
                   
                   lyrics.songl();
                   
                   
                   Clip ready = AudioSystem.getClip();
                  ready.open(type);
                   
                   ready.start();
                
                  
                   String smusic =" ";
                   
                   while(!smusic.equals("Q")){
                     
                       
                         System.out.println("Q = Stop the Music");
                  
                       System.out.print("Enter Command: ");
                       
                   smusic = s.nextLine().toUpperCase();
                  
                   }
                   break;
               case 2:
                   System.out.println("Playing Obesessed.....");
                   System.out.println("Creation Time: "+bute.creationTime());
                   System.out.println("Size of the music: "+bute.size());
                   System.out.println("Last Opened: "+bute.lastAccessTime());
                   System.out.println("--------------------------------------------");
                    System.out.println("The Lyrics: \n");
                    
                    Songlyrics lyr = new Songlyrics();
                    
                    lyr.song2();
                   
                   Clip set = AudioSystem.getClip();
                  set.open(type2);
                   
                   set.start();
                
                  
                   String simusic =" ";
                   
                   while(!simusic.equals("W")){
                     
                       
                         System.out.println("W = Stop the Music");
                  
                       System.out.printf("Enter Command: ");
                       
                   simusic = s.nextLine().toUpperCase();
                   
                   }
               break;
               case 3:
                   System.out.println("Playing New Jeans.....");
                   System.out.println("Creation Time: "+bute.creationTime());
                   System.out.println("Size of the music: "+bute.size());
                   System.out.println("Last Opened: "+bute.lastAccessTime());
                   System.out.println("--------------------------------------------");
                   System.out.println("The Lyrics: \n");
                   
                   Songlyrics lysw = new Songlyrics();
                   
                   lysw.song3();
                   
                  Clip go = AudioSystem.getClip();
                  go.open(type3);
                   
                   go.start();
                
                  
                   String the =" ";
                   
                   while(!the.equals("S")){
                     
                       
                         System.out.println("S = Stop the Music");
                  
                       System.out.printf("Enter Command: ");
                       
                   the = s.nextLine().toUpperCase();
                   }
                   break;
               case 4:
                       System.out.println("Playing Paubaya......");
                       System.out.println("Creation Time: "+bute.creationTime());
                   System.out.println("Size of the music: "+bute.size ()+" Bytes");
                   System.out.println("Last Opened: "+bute.lastAccessTime());
                       System.out.println("--------------------------------------------");
                       System.out.println("The Lyrics: \n");
                       
                       Songlyrics sad = new Songlyrics();
                       
                       sad.song4();
                       
                       Clip period = AudioSystem.getClip();
                       period.open(type4);
                       
                       period.start();
                       
                       String game =" ";
                       
                       while(!game.equals("P")){
                       
                           System.out.println("P = Stop the music");
                           
                           System.out.print("Enter Command: ");
                           
                           game = s.nextLine().toUpperCase();
                       }
                       
               default:
                     
                   
           }
             

        } catch(DirectoryNotEmptyException e){
            System.out.println("It is not Empty");
            
        } catch(SecurityException e){
            System.out.println("YOU HAVE NO PERMISSION!");
            
        }catch(FileNotFoundException e){
        
                 System.out.println("File Could not found.");
        
        }catch(UnsupportedAudioFileException e){
                 System.out.println("The Music File Is Not Supported!");
                 
                 
        }catch(InputMismatchException e){
                 System.out.println("Please Enter A NUMBERR not LETTERSSS!!!"+ e);
                 
        }catch(IllegalArgumentException e){
            System.out.println(choice+" Invalid!!!!"+ e +"Eto lang oh?? " + list);
            
        }catch(IOException e){
            
                 System.out.println("Error reading file attributes: " + e.getMessage());
        
        }finally{
                 System.out.println("Byeeee Run It Again if you want to play it.");
             }
        
    }
    
}