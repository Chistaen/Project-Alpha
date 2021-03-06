/**
 * PROJECT ALPHA
 * Open source hotel management software
 *
 * @version     1.0 Alpha 1
 * @author      Rick Nieborg, Mark Nieborg, Robert Monden
 * @copyright   Project Alpha, 2016-2017
 * @license     MIT
 *
 * Class information:
 * @package     Main
 * @since       1.0 Alpha 1
 * @author      Project Alpha development team
 */
package main;

import gui.main.Preferences;

public class PreferencesHandler {

    public PreferencesHandler() {

    }

    public static void execute() {
        Preferences guiPreferences = new Preferences();
        guiPreferences.displayScreen();
    }
}