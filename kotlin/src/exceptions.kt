// ni typed exceptions!
fun respond(npc: Character): String {
    return try {
        npc.greet()
        "Good morning!"
    } catch (e: IllegalStateException) {
        "..."
    } finally {
        //
    }
}