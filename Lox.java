package com.craftinginterpreters.lox;

import java.io.BufferedReader;
import java.io.IOExceptions;
import java.io.InputStreamReader;
import java.nio.charset.Chartset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lox {
  public static void main(String[] args) throws IOException {
    if (args.length > 1) {
      System.out.println("Usage: jlox [script]");
      System.exit(64);
    } else if (args.length == 1) {
      System.out.println("equals");
      // runFile(args[0]); 
    } else {
      System.out.println("last resort");
      // runPrompt();
    }
  }
}

