package Calculator;

import java.util.ArrayList;
import java.util.List;

public class Input {

    public void Process(char[] Input) {

        List<Operation> list = new ArrayList<Operation>();
        boolean first = true;
        boolean WasLastEmpty = false;
        char[] operations = new char[10];
        int operationscount = 0;

        // "Disassembling" of the input

        for (char c : Input) {
            switch (c) {
                case '1':
                    if (first) {
                        list.add(new Operation("1"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "1");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }
                    break;
                case '2':
                    if (first) {
                        list.add(new Operation("2"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "2");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }
                    break;
                case '3':
                    if (first) {
                        list.add(new Operation("3"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "3");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }
                    break;
                case '4':
                    if (first) {
                        list.add(new Operation("4"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "4");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }

                    break;
                case '5':
                    if (first) {
                        list.add(new Operation("5"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "5");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }

                    break;
                case '6':
                    if (first) {
                        list.add(new Operation("6"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "6");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }

                    break;
                case '7':
                    if (first) {
                        list.add(new Operation("7"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "7");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }

                    break;
                case '8':
                    if (first) {
                        list.add(new Operation("8"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "8");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }

                    break;
                case '9':
                    if (first) {
                        list.add(new Operation("9"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "9");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }
                    break;
                case '0':
                    if (first) {
                        list.add(new Operation("0"));
                        first = false;
                    } else {
                        Operation Entry = list.get(list.size() - 1);
                        Operation NewEntry = new Operation(Entry.Entry + "0");

                        if (WasLastEmpty) {
                            list.set(list.size() - 1, NewEntry);
                            WasLastEmpty = false;
                        }
                        list.set(list.size() - 1, NewEntry);
                        list.remove(Entry);
                        first = false;
                    }

                case ' ':
                    WasLastEmpty = true;
                    first = true;
                    break;
                case '+':
                    operations[operationscount + 1] = '+';
                    operationscount++;
                    first = false;
                    break;
                case '-':
                    operations[operationscount + 1] = '-';
                    operationscount++;
                    first = false;
                    break;
                case '*':
                    operations[operationscount + 1] = '*';
                    operationscount++;
                    first = false;
                    break;
                case '/':
                    operations[operationscount + 1] = '/';
                    operationscount++;
                    first = false;
                    break;

                default:
                    System.out.println("Error with the input Aborting...)");
                    break;
            }
        }
        Calculator calc = new Calculator();

        // Executing Math

        System.out.println("-> " + calc.Math(list, operations, operationscount));
    }
}
