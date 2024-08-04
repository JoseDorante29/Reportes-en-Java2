import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        // Configuración de la ventana
        setTitle("Sistema de Gestión");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Menú
        JMenuBar menuBar = new JMenuBar();
        JMenu reportesMenu = new JMenu("Reportes");
        
        JMenuItem reporteGeneral = new JMenuItem("Reporte General de Estudiantes");
        JMenuItem reportePorEstado = new JMenuItem("Reporte de Estudiantes por Estado");
        JMenuItem reporteIndividual = new JMenuItem("Reporte Individual por Estudiante");
        
        reportesMenu.add(reporteGeneral);
        reportesMenu.add(reportePorEstado);
        reportesMenu.add(reporteIndividual);
        
        menuBar.add(reportesMenu);
        setJMenuBar(menuBar);
        
        // Acciones del menú
        reporteGeneral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generarReporteGeneral();
            }
        });
        
        reportePorEstado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generarReportePorEstado();
            }
        });
        
        reporteIndividual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generarReporteIndividual();
            }
        });
    }
    
    private void generarReporteGeneral() {
        // Lógica para generar el reporte general de estudiantes
        JOptionPane.showMessageDialog(null, "Generando Reporte General de Estudiantes...");
    }
    
    private void generarReportePorEstado() {
        // Lógica para generar el reporte de estudiantes por estado
        JOptionPane.showMessageDialog(null, "Generando Reporte de Estudiantes por Estado...");
    }
    
    private void generarReporteIndividual() {
        // Lógica para generar el reporte individual por estudiante
        JOptionPane.showMessageDialog(null, "Generando Reporte Individual por Estudiante...");
    }
    
    private void eliminarRegistro() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            // Lógica para eliminar el registro
            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.");
        } else {
            // Cancelar la eliminación
            JOptionPane.showMessageDialog(null, "Acción cancelada.");
        }
    }

}
