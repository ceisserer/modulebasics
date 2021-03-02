package com.printer.impl;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class Printer {
    public void print(String message) {
        System.out.println(message);
      //  System.out.println(ansi().fgRed().a(message));
    }
}