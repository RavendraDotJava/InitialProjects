package com.weather.app;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;

public class MainApp extends javax.swing.JFrame {

    public MainApp() throws IOException, InterruptedException, JSONException {
        initComponents();

    }

    // Getting Weather Data From Api 
    public void Get() throws IOException, InterruptedException, JSONException {

        String loc = locationtext.getText();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/" + loc + "/today?unitGroup=metric&key=DRL3ESQZP8UT7HL7E4P8BJB42&contentType=json"))
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
        org.json.JSONObject js = new org.json.JSONObject(response.body());
//        System.out.println("----------------------------------------------");
//        System.out.println(js.names());
//        System.out.println(js.getJSONArray("days").getJSONObject(0).get("description"));
//        System.out.println(js.get("address"));
//        System.out.println(js.get("currentConditions"));
//        System.out.println(js.getJSONArray("days").getJSONObject(0).get("sunset").toString());
        String desc = js.getJSONArray("days").getJSONObject(0).get("description").toString();
        String resAdd = js.get("resolvedAddress").toString();
        String Sunrise = js.getJSONArray("days").getJSONObject(0).get("sunrise").toString();
        String Date = js.getJSONArray("days").getJSONObject(0).get("datetime").toString();
        String tem = js.getJSONArray("days").getJSONObject(0).get("temp").toString();
        String mintem = js.getJSONArray("days").getJSONObject(0).get("tempmin").toString();
        String maxtemp = js.getJSONArray("days").getJSONObject(0).get("tempmax").toString();
        String humidid = js.getJSONArray("days").getJSONObject(0).get("humidity").toString();
        String sunse = js.getJSONArray("days").getJSONObject(0).get("sunset").toString();
        String visibil = js.getJSONArray("days").getJSONObject(0).get("visibility").toString();
        String winspeed = js.getJSONArray("days").getJSONObject(0).get("windspeed").toString();
        String uvin = js.getJSONArray("days").getJSONObject(0).get("uvindex").toString();
        city.setText("Location :" + resAdd);
        sunr.setText("Sunrise :" + Sunrise);
        decs.setText("Condition :" + desc);
        maxtem.setText("Max Temp :" + maxtemp);
        mintemp.setText("Min Temp :" + mintem);
        sunset.setText("Sunset :" + sunse);
        temp.setText("Current Temprature :" + tem);
        uvindex.setText("Uv Insex :" + uvin);
        visibility.setText("Visibility :" + visibil);
        windspeed.setText("Windspeed :" + winspeed);
        humidity.setText("Humidity :" + humidid);
        datetime.setText("Date :" + Date);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        locationtext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        city = new javax.swing.JLabel();
        sunr = new javax.swing.JLabel();
        decs = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        mintemp = new javax.swing.JLabel();
        maxtem = new javax.swing.JLabel();
        sunset = new javax.swing.JLabel();
        datetime = new javax.swing.JLabel();
        windspeed = new javax.swing.JLabel();
        uvindex = new javax.swing.JLabel();
        visibility = new javax.swing.JLabel();
        humidity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(138, 221, 243));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Enter Your City");

        locationtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationtextActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setText("Get Weather");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        city.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        city.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        city.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sunr.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        sunr.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        decs.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        decs.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        temp.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        temp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        mintemp.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        mintemp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        maxtem.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        maxtem.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        sunset.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        sunset.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        datetime.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        datetime.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        windspeed.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        windspeed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        uvindex.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        uvindex.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        visibility.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        visibility.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        humidity.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        humidity.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(locationtext)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sunset, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(282, 282, 282))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(decs, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sunr, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(maxtem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                .addComponent(mintemp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(temp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(visibility, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uvindex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(windspeed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datetime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(humidity, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(locationtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sunr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mintemp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxtem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(datetime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(windspeed, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uvindex, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(visibility, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(humidity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sunset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void locationtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationtextActionPerformed

    }//GEN-LAST:event_locationtextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Get();
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainApp().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JSONException ex) {
                    Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city;
    private javax.swing.JLabel datetime;
    private javax.swing.JLabel decs;
    private javax.swing.JLabel humidity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField locationtext;
    private javax.swing.JLabel maxtem;
    private javax.swing.JLabel mintemp;
    private javax.swing.JLabel sunr;
    private javax.swing.JLabel sunset;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel uvindex;
    private javax.swing.JLabel visibility;
    private javax.swing.JLabel windspeed;
    // End of variables declaration//GEN-END:variables
}
