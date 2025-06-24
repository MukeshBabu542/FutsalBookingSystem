package futsalbookingsystem.controller;

import futsalbookingsystem.database.MySqlConnection;
import futsalbookingsystem.view.BookingView;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class BookingController {
    private BookingView view;
    private String userEmail;

    public BookingController(BookingView view, String userEmail) {
        this.view = view;
        this.userEmail = userEmail;
        setupLabelListeners();
        setInitialLabelColors();
    }
    
    

    private void setupLabelListeners() {

    view.getJLabel23().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                handleBookingLabelClick(view.getJLabel23());
            }
        });
    view.getJLabel24().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel24());
        }
    });

    view.getJLabel25().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel25());
        }
    });

    view.getJLabel26().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel26());
        }
    });

    view.getJLabel27().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel27());
        }
    });

    view.getJLabel28().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel28());
        }
    });

    view.getJLabel29().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel29());
        }
    });

    view.getJLabel30().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel30());
        }
    });

    view.getJLabel31().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel31());
        }
    });

    view.getJLabel32().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel32());
        }
    });

    view.getJLabel33().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel33());
        }
    });

    view.getJLabel34().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel34());
        }
    });

    view.getJLabel35().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel35());
        }
    });

    view.getJLabel36().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel36());
        }
    });

    view.getJLabel37().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel37());
        }
    });

    view.getJLabel38().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel38());
        }
    });

    view.getJLabel39().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel39());
        }
    });

    view.getJLabel40().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel40());
        }
    });
    view.getJLabel52().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel52());
        }
    });
    view.getJLabel53().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel53());
        }
    });
    view.getJLabel54().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel54());
        }
    });
    view.getJLabel55().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel55());
        }
    });
    view.getJLabel56().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel56());
        }
    });
    view.getJLabel57().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel57());
        }
    });
    view.getJLabel58().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel58());
        }
    });
    view.getJLabel59().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel59());
        }
    });
    view.getJLabel60().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel60());
        }
    });
    view.getJLabel61().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel61());
        }
    });
    view.getJLabel62().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel62());
        }
    });
    view.getJLabel63().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel63());
        }
    });
    view.getJLabel64().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel64());
        }
    });
    view.getJLabel65().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel65());
        }
    });
    view.getJLabel66().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel66());
        }
    });
    view.getJLabel67().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel67());
        }
    });
    view.getJLabel68().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel68());
        }
    });
    view.getJLabel69().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel69());
        }
    });
    view.getJLabel70().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel70());
        }
    });
    view.getJLabel71().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel71());
        }
    });
    view.getJLabel72().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel72());
        }
    });
    view.getJLabel73().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel73());
        }
    });
    view.getJLabel74().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel74());
        }
    });
    view.getJLabel75().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel75());
        }
    });
    view.getJLabel76().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel76());
        }
    });
    view.getJLabel77().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel77());
        }
    });
    view.getJLabel78().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel78());
        }
    });
    view.getJLabel79().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel79());
        }
    });
    view.getJLabel80().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel80());
        }
    });
    view.getJLabel81().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel81());
        }
    });
    view.getJLabel82().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel82());
        }
    });
    view.getJLabel83().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel83());
        }
    });
    view.getJLabel84().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel84());
        }
    });
    view.getJLabel85().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel85());
        }
    });
    view.getJLabel86().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel86());
        }
    });
    view.getJLabel87().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel87());
        }
    });
    view.getJLabel88().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel88());
        }
    });
    view.getJLabel89().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel89());
        }
    });
    view.getJLabel90().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel90());
        }
    });
    view.getJLabel91().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel91());
        }
    });
    view.getJLabel92().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel92());
        }
    });
    view.getJLabel93().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel93());
        }
    });
    view.getJLabel94().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel94());
        }
    });
    view.getJLabel95().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel95());
        }
    });
    view.getJLabel96().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel96());
        }
    });
    view.getJLabel97().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel97());
        }
    });
    view.getJLabel98().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel98());
        }
    });
    view.getJLabel99().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel99());
        }
    });
    view.getJLabel100().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel100());
        }
    });
    view.getJLabel101().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel101());
        }
    });
    view.getJLabel102().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel102());
        }
    });
    view.getJLabel103().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel103());
        }
    });
    view.getJLabel104().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel104());
        }
    });
    view.getJLabel105().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel105());
        }
    });
    view.getJLabel106().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel106());
        }
    });
    view.getJLabel107().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel107());
        }
    });
    view.getJLabel108().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel108());
        }
    });
    view.getJLabel109().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel109());
        }
    });
    view.getJLabel110().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel110());
        }
    });
    view.getJLabel111().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel111());
        }
    });
    view.getJLabel112().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel112());
        }
    });
    view.getJLabel113().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel113());
        }
    });
    view.getJLabel114().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel114());
        }
    });
    view.getJLabel115().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel115());
        }
    });
    view.getJLabel116().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel116());
        }
    });
    view.getJLabel117().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt) {
            handleBookingLabelClick(view.getJLabel117());
        }
    });
    }

    private void setInitialLabelColors() {
        String status = getBookingStatusFromDatabase();
        Color color = "booked".equalsIgnoreCase(status) ? Color.GREEN : Color.RED;

        view.getJLabel23().setBackground(color.RED);
        view.getJLabel23().setOpaque(true);
        view.getJLabel23().repaint();
        
        view.getJLabel24().setBackground(color.RED);
        view.getJLabel24().setOpaque(true);
        view.getJLabel24().repaint();

        view.getJLabel25().setBackground(color.RED);
        view.getJLabel25().setOpaque(true);
        view.getJLabel25().repaint();

        view.getJLabel26().setBackground(color.RED);
        view.getJLabel26().setOpaque(true);
        view.getJLabel26().repaint();

        view.getJLabel27().setBackground(color.RED);
        view.getJLabel27().setOpaque(true);
        view.getJLabel27().repaint();

        view.getJLabel28().setBackground(color.RED);
        view.getJLabel28().setOpaque(true);
        view.getJLabel28().repaint();

        view.getJLabel29().setBackground(color.RED);
        view.getJLabel29().setOpaque(true);
        view.getJLabel29().repaint();

        view.getJLabel30().setBackground(color.RED);
        view.getJLabel30().setOpaque(true);
        view.getJLabel30().repaint();

        view.getJLabel31().setBackground(color.RED);
        view.getJLabel31().setOpaque(true);
        view.getJLabel31().repaint();

        view.getJLabel32().setBackground(color.RED);
        view.getJLabel32().setOpaque(true);
        view.getJLabel32().repaint();

        view.getJLabel33().setBackground(color.RED);
        view.getJLabel33().setOpaque(true);
        view.getJLabel33().repaint();

        view.getJLabel34().setBackground(color.RED);
        view.getJLabel34().setOpaque(true);
        view.getJLabel34().repaint();

        view.getJLabel35().setBackground(color.RED);
        view.getJLabel35().setOpaque(true);
        view.getJLabel35().repaint();

        view.getJLabel36().setBackground(color.RED);
        view.getJLabel36().setOpaque(true);
        view.getJLabel36().repaint();

        view.getJLabel37().setBackground(color.RED);
        view.getJLabel37().setOpaque(true);
        view.getJLabel37().repaint();

        view.getJLabel38().setBackground(color.RED);
        view.getJLabel38().setOpaque(true);
        view.getJLabel38().repaint();

        view.getJLabel39().setBackground(color.RED);
        view.getJLabel39().setOpaque(true);
        view.getJLabel39().repaint();

        view.getJLabel40().setBackground(color.RED);
        view.getJLabel40().setOpaque(true);
        view.getJLabel40().repaint();

        view.getJLabel52().setBackground(color.RED);
        view.getJLabel52().setOpaque(true);
        view.getJLabel52().repaint();

        view.getJLabel53().setBackground(color.RED);
        view.getJLabel53().setOpaque(true);
        view.getJLabel53().repaint();

        view.getJLabel54().setBackground(color.RED);
        view.getJLabel54().setOpaque(true);
        view.getJLabel54().repaint();

        view.getJLabel55().setBackground(color.RED);
        view.getJLabel55().setOpaque(true);
        view.getJLabel55().repaint();

        view.getJLabel56().setBackground(color.RED);
        view.getJLabel56().setOpaque(true);
        view.getJLabel56().repaint();

        view.getJLabel57().setBackground(color.RED);
        view.getJLabel57().setOpaque(true);
        view.getJLabel57().repaint();

        view.getJLabel58().setBackground(color.RED);
        view.getJLabel58().setOpaque(true);
        view.getJLabel58().repaint();

        view.getJLabel59().setBackground(color.RED);
        view.getJLabel59().setOpaque(true);
        view.getJLabel59().repaint();

        view.getJLabel60().setBackground(color.RED);
        view.getJLabel60().setOpaque(true);
        view.getJLabel60().repaint();

        view.getJLabel61().setBackground(color.RED);
        view.getJLabel61().setOpaque(true);
        view.getJLabel61().repaint();

        view.getJLabel62().setBackground(color.RED);
        view.getJLabel62().setOpaque(true);
        view.getJLabel62().repaint();

        view.getJLabel63().setBackground(color.RED);
        view.getJLabel63().setOpaque(true);
        view.getJLabel63().repaint();

        view.getJLabel64().setBackground(color.RED);
        view.getJLabel64().setOpaque(true);
        view.getJLabel64().repaint();

        view.getJLabel65().setBackground(color.RED);
        view.getJLabel65().setOpaque(true);
        view.getJLabel65().repaint();

        view.getJLabel66().setBackground(color.RED);
        view.getJLabel66().setOpaque(true);
        view.getJLabel66().repaint();

        view.getJLabel67().setBackground(color.RED);
        view.getJLabel67().setOpaque(true);
        view.getJLabel67().repaint();

        view.getJLabel68().setBackground(color.RED);
        view.getJLabel68().setOpaque(true);
        view.getJLabel68().repaint();

        view.getJLabel69().setBackground(color.RED);
        view.getJLabel69().setOpaque(true);
        view.getJLabel69().repaint();

        view.getJLabel70().setBackground(color.RED);
        view.getJLabel70().setOpaque(true);
        view.getJLabel70().repaint();

        view.getJLabel71().setBackground(color.RED);
        view.getJLabel71().setOpaque(true);
        view.getJLabel71().repaint();

        view.getJLabel72().setBackground(color.RED);
        view.getJLabel72().setOpaque(true);
        view.getJLabel72().repaint();

        view.getJLabel73().setBackground(color.RED);
        view.getJLabel73().setOpaque(true);
        view.getJLabel73().repaint();

        view.getJLabel74().setBackground(color.RED);
        view.getJLabel74().setOpaque(true);
        view.getJLabel74().repaint();

        view.getJLabel75().setBackground(color.RED);
        view.getJLabel75().setOpaque(true);
        view.getJLabel75().repaint();

        view.getJLabel76().setBackground(color.RED);
        view.getJLabel76().setOpaque(true);
        view.getJLabel76().repaint();

        view.getJLabel77().setBackground(color.RED);
        view.getJLabel77().setOpaque(true);
        view.getJLabel77().repaint();

        view.getJLabel78().setBackground(color.RED);
        view.getJLabel78().setOpaque(true);
        view.getJLabel78().repaint();

        view.getJLabel79().setBackground(color.RED);
        view.getJLabel79().setOpaque(true);
        view.getJLabel79().repaint();

        view.getJLabel80().setBackground(color.RED);
        view.getJLabel80().setOpaque(true);
        view.getJLabel80().repaint();

        view.getJLabel81().setBackground(color.RED);
        view.getJLabel81().setOpaque(true);
        view.getJLabel81().repaint();

        view.getJLabel82().setBackground(color.RED);
        view.getJLabel82().setOpaque(true);
        view.getJLabel82().repaint();

        view.getJLabel83().setBackground(color.RED);
        view.getJLabel83().setOpaque(true);
        view.getJLabel83().repaint();

        view.getJLabel84().setBackground(color.RED);
        view.getJLabel84().setOpaque(true);
        view.getJLabel84().repaint();

        view.getJLabel85().setBackground(color.RED);
        view.getJLabel85().setOpaque(true);
        view.getJLabel85().repaint();

        view.getJLabel86().setBackground(color.RED);
        view.getJLabel86().setOpaque(true);
        view.getJLabel86().repaint();

        view.getJLabel87().setBackground(color.RED);
        view.getJLabel87().setOpaque(true);
        view.getJLabel87().repaint();

        view.getJLabel88().setBackground(color.RED);
        view.getJLabel88().setOpaque(true);
        view.getJLabel88().repaint();

        view.getJLabel89().setBackground(color.RED);
        view.getJLabel89().setOpaque(true);
        view.getJLabel89().repaint();

        view.getJLabel90().setBackground(color.RED);
        view.getJLabel90().setOpaque(true);
        view.getJLabel90().repaint();

        view.getJLabel91().setBackground(color.RED);
        view.getJLabel91().setOpaque(true);
        view.getJLabel91().repaint();

        view.getJLabel92().setBackground(color.RED);
        view.getJLabel92().setOpaque(true);
        view.getJLabel92().repaint();

        view.getJLabel93().setBackground(color.RED);
        view.getJLabel93().setOpaque(true);
        view.getJLabel93().repaint();

        view.getJLabel94().setBackground(color.RED);
        view.getJLabel94().setOpaque(true);
        view.getJLabel94().repaint();

        view.getJLabel95().setBackground(color.RED);
        view.getJLabel95().setOpaque(true);
        view.getJLabel95().repaint();

        view.getJLabel96().setBackground(color.RED);
        view.getJLabel96().setOpaque(true);
        view.getJLabel96().repaint();

        view.getJLabel97().setBackground(color.RED);
        view.getJLabel97().setOpaque(true);
        view.getJLabel97().repaint();

        view.getJLabel98().setBackground(color.RED);
        view.getJLabel98().setOpaque(true);
        view.getJLabel98().repaint();

        view.getJLabel99().setBackground(color.RED);
        view.getJLabel99().setOpaque(true);
        view.getJLabel99().repaint();

        view.getJLabel100().setBackground(color.RED);
        view.getJLabel100().setOpaque(true);
        view.getJLabel100().repaint();

        view.getJLabel101().setBackground(color.RED);
        view.getJLabel101().setOpaque(true);
        view.getJLabel101().repaint();

        view.getJLabel102().setBackground(color.RED);
        view.getJLabel102().setOpaque(true);
        view.getJLabel102().repaint();

        view.getJLabel103().setBackground(color.RED);
        view.getJLabel103().setOpaque(true);
        view.getJLabel103().repaint();

        view.getJLabel104().setBackground(color.RED);
        view.getJLabel104().setOpaque(true);
        view.getJLabel104().repaint();

        view.getJLabel105().setBackground(color.RED);
        view.getJLabel105().setOpaque(true);
        view.getJLabel105().repaint();

        view.getJLabel106().setBackground(color.RED);
        view.getJLabel106().setOpaque(true);
        view.getJLabel106().repaint();

        view.getJLabel107().setBackground(color.RED);
        view.getJLabel107().setOpaque(true);
        view.getJLabel107().repaint();

        view.getJLabel108().setBackground(color.RED);
        view.getJLabel108().setOpaque(true);
        view.getJLabel108().repaint();

        view.getJLabel109().setBackground(color.RED);
        view.getJLabel109().setOpaque(true);
        view.getJLabel109().repaint();

        view.getJLabel110().setBackground(color.RED);
        view.getJLabel110().setOpaque(true);
        view.getJLabel110().repaint();

        view.getJLabel111().setBackground(color.RED);
        view.getJLabel111().setOpaque(true);
        view.getJLabel111().repaint();

        view.getJLabel112().setBackground(color.RED);
        view.getJLabel112().setOpaque(true);
        view.getJLabel112().repaint();

        view.getJLabel113().setBackground(color.RED);
        view.getJLabel113().setOpaque(true);
        view.getJLabel113().repaint();

        view.getJLabel114().setBackground(color.RED);
        view.getJLabel114().setOpaque(true);
        view.getJLabel114().repaint();

        view.getJLabel115().setBackground(color.RED);
        view.getJLabel115().setOpaque(true);
        view.getJLabel115().repaint();

        view.getJLabel116().setBackground(color.RED);
        view.getJLabel116().setOpaque(true);
        view.getJLabel116().repaint();

        view.getJLabel117().setBackground(color.RED);
        view.getJLabel117().setOpaque(true);
        view.getJLabel117().repaint();

    }


    private void handleBookingLabelClick(javax.swing.JLabel label) {
        int result = JOptionPane.showOptionDialog(
            view,
            "Do you want to book now?",
            "Booking Confirmation",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] { "Book Now", "Cancel" },
            "Book Now"
        );

        String newStatus = (result == JOptionPane.YES_OPTION) ? "booked" : "cancelled";
        boolean success = updateBookingStatusInDatabase(newStatus);

        if (success) {
            label.setBackground("booked".equals(newStatus) ? Color.GREEN : Color.RED);
            label.setOpaque(true);
            label.repaint();
            JOptionPane.showMessageDialog(view, "Booking status updated in database.");
        } else {
            JOptionPane.showMessageDialog(view, "Failed to update booking status.");
        }
    }
        private boolean updateBookingStatusInDatabase(String status) {
            MySqlConnection mysql = new MySqlConnection();
            Connection conn = mysql.openConnection();
            try {
                String createTableSQL = "CREATE TABLE IF NOT EXISTS bookings ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "user_email VARCHAR(100) UNIQUE NOT NULL, "
                    + "status VARCHAR(20) NOT NULL"
                    + ")";
                PreparedStatement createStmt = conn.prepareStatement(createTableSQL);
                createStmt.executeUpdate();

                String sql = "INSERT INTO bookings (user_email, status) VALUES (?, ?) "
                        + "ON DUPLICATE KEY UPDATE status=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, userEmail);
                stmt.setString(2, status);
                stmt.setString(3, status);
                int rows = stmt.executeUpdate();
                return rows > 0;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            } finally {
                mysql.closeConnection(conn);
            }
        }


    private String getBookingStatusFromDatabase() {
        MySqlConnection mysql = new MySqlConnection();
        Connection conn = mysql.openConnection();
        try {
            String sql = "SELECT status FROM bookings WHERE user_email=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, userEmail);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString("status");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mysql.closeConnection(conn);
        }
        return "cancelled"; // Default status
    }
}
