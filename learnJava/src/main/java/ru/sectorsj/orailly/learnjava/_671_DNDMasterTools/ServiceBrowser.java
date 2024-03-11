package ru.sectorsj.orailly.learnjava._671_DNDMasterTools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

public class ServiceBrowser {
    JPanel mainPanel;
    JComboBox serviceList;
    ServiceServer server;

    public static void main(String[] args) {
        new ServiceBrowser().buildGUI();
    }

    public void buildGUI(){
        JFrame frame = new JFrame("RMI Browser");
        mainPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);

        Object[] services = getServiceList();

        serviceList = new JComboBox(services);

        frame.getContentPane().add(BorderLayout.NORTH, serviceList);

        serviceList.addActionListener(new MyListListener());

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    void loadService(Object serviceSelection) {
        try {
            Service svc = server.getService(serviceSelection);
            mainPanel.removeAll();
            mainPanel.add(svc.getGuiPanel());
            mainPanel.validate();
            mainPanel.repaint();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    Object[] getServiceList() {
        Object obj = null;
        Object[] services = null;

        try {
            obj = Naming.lookup("rmi://127.0.0.1:5000/ServiceServer");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        server = (ServiceServer) obj;

        try {
            // assert server != null;
            services = server.getServiceList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return services;
    }

    private class MyListListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object selection = serviceList.getSelectedItem();
            loadService(selection);
        }
    }
}