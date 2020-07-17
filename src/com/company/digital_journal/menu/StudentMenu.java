package com.company.digital_journal.menu;

import com.company.digital_journal.entity.Journal;
import com.company.digital_journal.util.InputUtil;
import com.company.digital_journal.util.JournalUtil;

public class StudentMenu implements Menuable {

    private InputUtil inputUtil = new InputUtil();
    private JournalUtil journalUtil= new JournalUtil();
    private Journal journal;

    public StudentMenu(Journal journal) {
        this.journal = journal;
    }

    @Override
    public void menu() {
        while(true) {
            inputUtil.showMenu(false);
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
                    return;
                }
            }
        }
    }
}
