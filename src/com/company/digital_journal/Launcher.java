package com.company.digital_journal;

import com.company.digital_journal.entity.Journal;
import com.company.digital_journal.menu.Menuable;
import com.company.digital_journal.menu.StudentMenu;
import com.company.digital_journal.menu.TeacherMenu;
import com.company.digital_journal.util.InputUtil;

public class Launcher {

    private InputUtil inputUtil;

    private Journal journal;

    public Launcher(Journal journal) {
        this.journal = journal;
        this.inputUtil = new InputUtil();
    }

    public void launch() {
        while (true) {
            switch (inputUtil.getString("How you wanna log in? Teacher - enter T, Student - enter S, Exit - enter E: ")) {
                case "T": {
                    startMenu(new TeacherMenu(this.journal));
                    break;
                }
                case "S": {
                    startMenu(new StudentMenu(this.journal));
                    break;
                }
                case "E": {
                    return;
                } default: {
                    System.out.println("Try again...");
                }
            }
        }
    }

    private void startMenu(Menuable menuable) {
        menuable.menu();
    }

}
