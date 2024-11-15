import { FormControl, ValidationErrors } from "@angular/forms";

export class Myvalidators {
  static notOnlyWhitespace(control: FormControl) : ValidationErrors {
    if ((control.value != null) && (control.value.trim().length === 0)) {
      return { 'notOnlyWhitespace': true };
    } else {
      return { 'notOnlyWhitespace': false };
    }
  }
}
