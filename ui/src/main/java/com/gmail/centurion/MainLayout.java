package com.gmail.centurion;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.gmail.centurion.about.AboutView;
import com.gmail.centurion.crud.SampleCrudView;

/**
 * The layout of the pages e.g. About and Inventory.
 */
@StyleSheet("css/shared-styles.css")
@Theme(value = Lumo.class, variant = Lumo.DARK)
public class MainLayout extends FlexLayout implements RouterLayout {

    private final Menu menu;

    public MainLayout() {
        setSizeFull();
        setClassName("main-layout");

        menu = new Menu();
        menu.addView(SampleCrudView.class, SampleCrudView.CAPTION, VaadinIcon.EDIT.create());
        menu.addView(AboutView.class, AboutView.CAPTION, VaadinIcon.INFO_CIRCLE.create());

        add(menu);
    }
}
