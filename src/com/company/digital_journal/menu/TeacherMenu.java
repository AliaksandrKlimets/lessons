package com.company.digital_journal.menu;

import com.company.digital_journal.entity.Journal;
import com.company.digital_journal.util.InputUtil;
import com.company.digital_journal.util.JournalUtil;

public class TeacherMenu implements Menuable {


    private InputUtil inputUtil = new InputUtil();
    private JournalUtil journalUtil = new JournalUtil();
    private Journal journal;

    public TeacherMenu(Journal journal) {
        this.journal = journal;
    }

    @Override
    public void menu() {
        while (true) {
            String login = inputUtil.getString("Enter login: ");
            String password = inputUtil.getString("Enter password: ");
            if (login.equals(journal.getTeacher().getLogin()) && password.equals(journal.getTeacher().getPassword())) {
                while (true) {
                    inputUtil.showMenu(true);
                    switch (inputUtil.getInteger()) {
                        case 1: {
                            journalUtil.showJournal(this.journal);
                            break;
                        }
                        case 2: {
                            journalUtil.showAverageMarkBySubject(this.journal);
                            break;
                        }
                        case 3: {
                            journalUtil.showAverageMarkByStudent(this.journal);
                            break;
                        }
                        case 4: {
                            journalUtil.addStudent(this.journal);
                            break;
                        }
                        case 5: {
                            journalUtil.addMark(this.journal);
                            break;
                        }
                        case 6: {
                            return;
                        }
                    }
                }
            } else {
                String exit = inputUtil.getString("Incorrect credentials, enter anything except E to try again or enter E to exit");
                if (exit.equals("E")) return;
            }
        }
    }
}
