package org.hexworks.zircon.examples;

import org.hexworks.zircon.api.*;
import org.hexworks.zircon.api.application.CursorStyle;
import org.hexworks.zircon.api.builder.application.AppConfigBuilder;
import org.hexworks.zircon.api.data.Position;
import org.hexworks.zircon.api.grid.TileGrid;
import org.hexworks.zircon.api.uievent.KeyCode;
import org.hexworks.zircon.api.uievent.KeyboardEventType;

public class TypingExample {

    private static final int TERMINAL_WIDTH = 40;

    public static void main(String[] args) {

        final TileGrid tileGrid = SwingApplications.startTileGrid(AppConfigBuilder.Companion.newBuilder()
                .withDefaultTileset(CP437TilesetResources.bisasam16x16())
                .withSize(Sizes.create(TERMINAL_WIDTH, 10))
                .withCursorBlinking(true)
                .withCursorStyle(CursorStyle.FIXED_BACKGROUND)
                .withCursorColor(TileColors.fromString("#ff00ff"))
                .build());

        tileGrid.handleKeyboardEvents(KeyboardEventType.KEY_PRESSED, (event, phase) -> {
            final Position pos = tileGrid.getCursorPosition();
            if (event.getCode().equals(KeyCode.ESCAPE)) {
                System.exit(0);
            } else if (event.getCode().equals(KeyCode.ENTER)) {
                tileGrid.setCursorPosition(pos.withRelativeY(1).withX(0));
            } else {
                tileGrid.putTile(Tiles.newBuilder().withCharacter(event.getKey().charAt(0)).build());
            }
            return UIEventResponses.processed();
        });
    }
}
