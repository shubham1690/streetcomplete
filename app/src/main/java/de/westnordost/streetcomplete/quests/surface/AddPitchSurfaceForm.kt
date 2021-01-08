package de.westnordost.streetcomplete.quests.surface

import androidx.appcompat.app.AlertDialog
import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.quests.AImageListQuestAnswerFragment
import de.westnordost.streetcomplete.view.image_select.Item

class AddPitchSurfaceForm : AImageListQuestAnswerFragment<String, SurfaceAnswer>() {
    override val items: List<Item<String>>
        get() =
            listOf(Surface.GRASS, Surface.ASPHALT, Surface.SAND, Surface.CONCRETE,
                Surface.CLAY, Surface.ARTIFICIAL_TURF, Surface.TARTAN, Surface.DIRT,
                Surface.FINE_GRAVEL, Surface.PAVING_STONES, Surface.COMPACTED,
                Surface.SETT, Surface.UNHEWN_COBBLESTONE, Surface.GRASS_PAVER,
                Surface.WOOD, Surface.METAL, Surface.GRAVEL, Surface.PEBBLES,
                Surface.ROCK).toItems() +
                Item("paved", R.drawable.surface_paved_area, R.string.quest_surface_value_paved, null, listOf()) +
                Item("unpaved", R.drawable.surface_unpaved_area, R.string.quest_surface_value_unpaved, null, listOf()) +
                Item("ground", R.drawable.surface_ground_area, R.string.quest_surface_value_ground, null, listOf())

    override val itemsPerRow = 3

    override fun onClickOk(selectedItems: List<String>) {
        val value = selectedItems.single()
        if (value == "paved" || value == "unpaved") {
            AlertDialog.Builder(requireContext())
                .setMessage(R.string.quest_surface_detailed_answer_impossible_confirmation)
                .setPositiveButton(R.string.quest_generic_confirmation_yes) { _, _ ->
                    DescribeGenericSurfaceDialog(requireContext()) { description ->
                        applyAnswer(GenericSurfaceAnswer(value, description))
                    }.show()
                }
                .setNegativeButton(android.R.string.cancel, null)
                .show()
            return
        }
        applyAnswer(SpecificSurfaceAnswer(value))
    }
}