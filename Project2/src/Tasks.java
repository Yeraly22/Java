import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tasks extends Container  {
    private JTextField taskField;
    private DefaultListModel<String> tasksModel;
    private JList<String> tasksList;

    private JButton  addButton,backButton,editButton, deleteButton;

    public Tasks() {
        setLayout(new BorderLayout());

        tasksModel = new DefaultListModel<>();
        tasksList = new JList<>(tasksModel);
        JScrollPane scrollPane = new JScrollPane(tasksList);
        scrollPane.setPreferredSize(new Dimension(300, 200));
        add(scrollPane, BorderLayout.CENTER);

        taskField = new JTextField(20);
        add(taskField, BorderLayout.NORTH);

        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    tasksModel.addElement(task);
                    taskField.setText("");
                }
            }
        });
        editButton = new JButton("Edit");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tasksList.getSelectedIndex();
                if (index != -1) {
                    String task = taskField.getText().trim();
                    if (!task.isEmpty()) {
                        tasksModel.setElementAt(task, index);
                        taskField.setText("");
                    }
                }
            }
        });
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tasksList.getSelectedIndex();
                if (index != -1) {
                    tasksModel.removeElementAt(index);
                }
            }
        });


        backButton = new JButton("Back");
        backButton.setBounds(200,250,145,30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.taskWindow.setVisible(false);
                Main.frame.menuWindow2.setVisible(true);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(backButton);
        add(buttonPanel, BorderLayout.SOUTH);
        setSize(700, 400);
    }

}
