package lab7_8;

import lab7_8.DAOs.SotrDAO;
import lab7_8.DAOs.SpecDAO;
import lab7_8.DAOs.VussDAO;
import lab7_8.Entities.Sotr;
import lab7_8.Entities.Spec;
import lab7_8.Entities.Vuss;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

final class Gui extends JFrame {

    /**
     * Интерфейс и всякие кнопочки
     */
    Gui() {
        super("Database program");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Программа позволяет взаимодействовать с базой данных");
        panel.add(label);

        JButton getAllSotrButton = new JButton("Получить всех сотрудников");
        getAllSotrButton.addActionListener(e -> {
            SotrDAO sotrDAO = new SotrDAO();
            try {
                List<Sotr> list = sotrDAO.getAll();
                JOptionPane.showMessageDialog(panel, Arrays.toString(list.toArray()));
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        });

        JButton getAllSpecButton = new JButton("Получить все специальности");
        getAllSpecButton.addActionListener(e -> {
            SpecDAO specDAO = new SpecDAO();
            try {
                List<Spec> list = specDAO.getAll();
                JOptionPane.showMessageDialog(panel, Arrays.toString(list.toArray()));
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        JButton getAllVussButton = new JButton("Получить все ВУЗы");
        getAllVussButton.addActionListener(e -> {
            VussDAO vussDAO = new VussDAO();
            try {
                List<Vuss> list = vussDAO.getAll();
                JOptionPane.showMessageDialog(panel, Arrays.toString(list.toArray()));
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        JButton getFoneBySotr = new JButton("Получить телефон сотрудника по id");
        getFoneBySotr.addActionListener(e -> {
            SotrDAO sotrDAO = new SotrDAO();
            try {
                Sotr sotr = sotrDAO.getById(Integer.parseInt(
                        JOptionPane.showInputDialog(panel, "Введите id сотрудника")));
                if (sotr != null) {
                    JOptionPane.showMessageDialog(panel, sotr.getName() + ": " + sotr.getFone());
                } else {
                    JOptionPane.showMessageDialog(panel, "Нет такого сотрудника!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        JButton getInfoFromSpec = new JButton("Получить информацию о специальности");
        getInfoFromSpec.addActionListener(e -> {
            SpecDAO specDAO = new SpecDAO();
            try {
                Spec spec = specDAO.getById(Integer.parseInt(
                        JOptionPane.showInputDialog(panel, "Введите id специальности")));
                if (spec != null) {
                    JOptionPane.showMessageDialog(panel, spec.getName() + ": " + spec.getInfo());
                } else {
                    JOptionPane.showMessageDialog(panel, "Нет такой специальности!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        });


        panel.add(getAllSotrButton);
        panel.add(getAllSpecButton);
        panel.add(getAllVussButton);
        panel.add(getFoneBySotr);
        panel.add(getInfoFromSpec);

        setSize(400, 150);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
