package mx.datafox.androidactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    /*
        Ciclo de vida de la Actividad (Activity LifeCycle)

        - onCreate() Se activa cuando el sistema crea la actividad por primera vez, aquí va la lógica de arranque básica de la aplicación que debe ocurrir una sola vez en toda la vida de la actividad

        - onStart() Hace que el usuario pueda ver la actividad mientras la app se prepara para que esta entre en primer plano y se convierta en interactiva. Este método es donde la app inicializa el código que mantiene la UI por ejemplo

        - onResume() Este es el estado en el que la app interactúa con el usuario. La app permanece en este estado hasta que ocurre algún evento que la quita de foco.

        - onPause() Indica que la actividad ya no está en primer plano (aunque puede seguir siendo visible si el usuario está en el modo multiventana). Utiliza el método onPause() para pausar o ajustar las operaciones que no deben continuar (o que deben continuar con moderación)

        - onStop() Cuando el usuario ya no puede ver tu actividad, significa que ha entrado en el estado Stopped, y el sistema invoca la devolución de llamada onStop(). Esto puede ocurrir, por ejemplo, cuando una actividad recién lanzada cubre toda la pantalla. El sistema también puede llamar a onStop() cuando haya terminado la actividad y esté a punto de finalizar.

        - onDestroy() En lugar de poner lógica en ese objeto para determinar por qué está finalizando la actividad, deberías utilizar un objeto ViewModel a fin de contener los datos de vista relevantes para Activity.

        https://developer.android.com/guide/components/activities/activity-lifecycle
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity", "Pasa por onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.e("MainActivity", "Pasa por onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.e("MainActivity", "Pasa por onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.e("MainActivity", "Pasa por onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.e("MainActivity", "Pasa por onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e("MainActivity", "Pasa por onDestroy")
    }
}