#include "raylib.h";

int main(){
  int screenWidth = 600;
  int screenHeight = 600;

  InitWindow(screenWidth, screenHeight);

  while (!WindowShouldClose()){
    BeginDrawing();
      ClearBackground(RAYWHITE);
      DrawText("Congrats! You created your first window!", 190, 200, 20, LIGHTGRAY);
    EndDrawing();
  }
  CloseWindow();
  
  return 0;
}