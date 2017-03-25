/*
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.mpalourdio.springboottemplate.model.entities;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.jpa.criteria.expression.function.CurrentTimestampFunction;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "task_list")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    private int id;

    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Column(name = "task_description", nullable = false)
    private String taskDescription;

    @Column(name = "task_priority", nullable = false)
    private String taskPriority;

    @Column(name = "task_status", nullable = false)
    private String taskStatus;

    @ColumnDefault("false")
    @Column(name = "task_archived", nullable = false)
    private Boolean taskArchived = false;

    @ColumnDefault(CurrentTimestampFunction.NAME)
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate = LocalDateTime.now();

    @OneToMany(mappedBy = "task")
    private List<People> people = new ArrayList<>();

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(final String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(final String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(final String taskPriority) {
        this.taskPriority = taskPriority;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(final String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Boolean isTaskArchived() {
        return taskArchived;
    }

    public void setTaskArchived(final Boolean taskArchived) {
        this.taskArchived = taskArchived;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(final List<People> people) {
        this.people = people;
    }


    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(final LocalDateTime startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", taskName=" + taskName
                + ", taskDescription=" + taskDescription + ", taskPriority="
                + taskPriority + ",taskStatus=" + taskStatus + "]";
    }
}