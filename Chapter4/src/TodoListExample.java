
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;
    
    public class TodoListExample {
        public static void main(String[] args) {
            // Create the frame
            JFrame frame = new JFrame("To-Do List");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());
    
            // Create components
            DefaultListModel<String> listModel = new DefaultListModel<>();
            JList<String> todoList = new JList<>(listModel);
            JTextField taskField = new JTextField();
            JButton addButton = new JButton("Add Task");
            JButton removeButton = new JButton("Remove Task");
    
            // Panel for input and buttons
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            panel.add(taskField);
            panel.add(addButton);
            panel.add(removeButton);
    
            // Add action listener to the Add Task button
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String task = taskField.getText();
                    if (!task.isEmpty()) {
                        listModel.addElement(task);
                        taskField.setText(""); // Clear input field
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please enter a task.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
    
            // Add action listener to the Remove Task button
            removeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedIndex = todoList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        listModel.remove(selectedIndex);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please select a task to remove.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
    
            // Add components to the frame
            frame.add(new JScrollPane(todoList), BorderLayout.CENTER);
            frame.add(panel, BorderLayout.SOUTH);
    
            // Set frame visibility
            frame.setVisible(true);
        }
    }
    
