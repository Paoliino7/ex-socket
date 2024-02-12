/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.esercitazione_socket;

echo "# EsercitazioneSocket5D" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M master
git remte add origin httsgithub.com/Paoliino7/ex-socket.git
    git push -u origin master


public class Server{
    publicmstatic void main (String[] args) throws IOException{
        int port = 12345;
        ServerSocket serverSocket = new ServerSocket(port);
        
        try{
            while(true){
                Socket clientSocket = serverSocket.accept();
                printWriter out = new PrinyterWriter(clienSocket.getOutputAtream(), true);
                out.println("ciao cliente");
                clientSockt.close();
            
        }
    }finally{
            serverSocket.close();
        }
}