class NotificationReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val builder = NotificationCompat.Builder(context, "habit_channel")
            .setSmallIcon(R.drawable.ic_notification) // Asegúrate de tener este ícono
            .setContentTitle("Recordatorio de hábito")
            .setContentText("¡No olvides registrar tus hábitos hoy!")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        val manager = NotificationManagerCompat.from(context)
        manager.notify(1, builder.build())
    }
}
