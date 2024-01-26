ServerEvents.recipes(event => {
	event.remove({ output: 'createaddition:diamond_grit_sandpaper' })
	
	event.shapeless(
		Item.of('createaddition:diamond_grit_sandpaper', 1),
		[
			'createaddition:diamond_grit',
			'minecraft:paper'
			]
		)
})