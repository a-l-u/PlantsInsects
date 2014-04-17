package plantsInsects.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory

class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory {

	public void addGlobalsAndPanelComponents(){
		
				
				/**
				 * Place custom panels and globals below, for example:
				 *
				 addGlobal("globalVariable1")	// Globally accessible variable ( variable name)
				 // Slider with label ( variable name, slider label, minimum value, increment, maximum value, initial value )
				 addSliderWL("sliderVariable", "Slider Variable", 0, 1, 10, 5)
				 // Slider without label ( variable name, minimum value, increment, maximum value, initial value )
				 addSlider("sliderVariable2", 0.2, 0.1, 0.8, 0.5)
				 // Chooser with label  ( variable name, chooser label, list of choices , zero-based index of initial value )
				 addChooserWL("chooserVariable", "Chooser Variable", ["yes","no","maybe"], 2)
				 // Chooser without label  ( variable name, list of choices , zero-based index of initial value )
				 addChooser("chooserVariable2", [1, 66, "seven"], 0)
				 // State change button (method name in observer)
				 addStateChangeButton("change")
				 // State change button with label (method name in observer, label)
				 addStateChangeButtonWL("changeSomething","Change Something")
				 */
				
				addSliderWL("numHumans", "Number of Humans", 1, 1, 100, 50)
				addSliderWL("numZombies", "Number of Zombies", 1, 1, 10, 5)
				addSliderWL("gestationPeriod", "Gestation", 5, 1, 30, 5)
				addMonitorWL("remainingHumans", "Remaining Humans", 5)
				addGlobal("zombieDiffusionRate",0.35)
				addGlobal("zombieEvaporationRate",0.08)
			}
}
