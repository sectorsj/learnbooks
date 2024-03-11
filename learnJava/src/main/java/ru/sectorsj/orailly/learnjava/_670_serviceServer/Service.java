package ru.sectorsj.orailly.learnjava._670_serviceServer;

import javax.swing.*;
import java.io.Serializable;

public interface Service extends Serializable {
    public JPanel getGuiPanel();
}