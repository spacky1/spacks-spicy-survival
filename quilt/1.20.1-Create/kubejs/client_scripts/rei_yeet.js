REIEvents.removeCategories(e => {
    console.log(e.getCategoryIds());
    e.remove('minecraft:plugins/tag');
    e.remove('allthetrims:plugins/smithing');
});